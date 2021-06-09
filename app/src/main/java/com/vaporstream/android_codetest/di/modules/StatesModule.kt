package com.vaporstream.android_codetest.di.modules

import android.app.Application
import androidx.concurrent.futures.CallbackToFutureAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.*
import com.google.common.util.concurrent.ListenableFuture
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.utilities.StatesInterface
import com.vaporstream.android_codetest.worker.GetStatesWorker
import dagger.Module
import dagger.Provides
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import java.util.*
import javax.inject.Singleton

@Module
class StatesModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideStateInterface(retrofit: Retrofit): StatesInterface {
        return retrofit.create(StatesInterface::class.java)
    }

    @Provides
    fun provideGetStatesWorkerId(): UUID {

        val constraints =
            Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()

        val request =
            OneTimeWorkRequestBuilder<GetStatesWorker>().setConstraints(constraints).build()

        WorkManager.getInstance(application.applicationContext).enqueue(request)

        return request.id
    }

    @Provides
    @Singleton
    fun provideStates(id: UUID): LiveData<Array<String>> {
        val statesLiveData = MutableLiveData(emptyArray<String>())

        WorkManager.getInstance(application.applicationContext).getWorkInfoByIdLiveData(id)
            .observeForever { info ->
                if (info != null && info.state.isFinished) {
                    statesLiveData.value = info.outputData.getStringArray(Constants.STATES_ARRAY)
                }
            }
        return statesLiveData
    }

    @Provides
    fun provideStatesWork(statesInterface: StatesInterface): ListenableFuture<ListenableWorker.Result> {
        return CallbackToFutureAdapter.getFuture { completer ->
            statesInterface.getStates().enqueue(object :
                Callback<List<String>> {

                override fun onResponse(
                    call: retrofit2.Call<List<String>>?,
                    response: Response<List<String>>?
                ) {
                    if (response != null && response.isSuccessful) {

                        val states =
                            arrayOf(Constants.SELECT_A_STATE) + response.body().toTypedArray()

                        val output = workDataOf(Constants.STATES_ARRAY to states)

                        completer.set(ListenableWorker.Result.success(output))
                    } else {
                        completer.set(ListenableWorker.Result.retry())
                    }
                }

                override fun onFailure(call: retrofit2.Call<List<String>>?, t: Throwable?) {
                    if (t != null) {
                        completer.setException(t)
                    }

                    completer.set(ListenableWorker.Result.retry())
                }
            })
        }
    }
}