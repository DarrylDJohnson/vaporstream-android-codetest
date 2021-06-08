package com.vaporstream.android_codetest.di.modules

import android.app.Application
import android.util.Log
import androidx.concurrent.futures.CallbackToFutureAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.ListenableWorker
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.google.common.util.concurrent.ListenableFuture
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.utilities.StatesInterface
import com.vaporstream.android_codetest.worker.GetStatesWorker
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import javax.inject.Singleton

@Module
class NetworkModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideStateInterface(retrofit: Retrofit): StatesInterface {
        return retrofit.create(StatesInterface::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }

    @Provides
    fun provideGetStatesWorkerId(): UUID {

        val request = OneTimeWorkRequestBuilder<GetStatesWorker>().build()

        WorkManager.getInstance(application.applicationContext).enqueue(request)

        return request.id
    }

    @Provides
    @Singleton
    fun provideStates(id: UUID): LiveData<Array<String>> {
        val statesLiveData = MutableLiveData(emptyArray<String>())

        Log.d(TAG, "provideStates: id $id")

        WorkManager.getInstance(application.applicationContext).getWorkInfoByIdLiveData(id)
            .observeForever { info ->
                if (info != null && info.state.isFinished) {
                    val states = info.outputData.getStringArray(Constants.STATES_ARRAY)
                    Log.d(TAG, "provideStates: states $states")

                    statesLiveData.value = states
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
                    Log.d(TAG, "providesStatesWork.onResponse: $response")

                    if (response != null && response.isSuccessful) {

                        val statesResponse = response.body().toTypedArray()

                        val statesResult = arrayOf(Constants.SELECT_A_STATE) + statesResponse

                        Log.d(TAG, "onResponse: states $statesResult")

                        val output =
                            workDataOf(Constants.STATES_ARRAY to statesResult)

                        completer.set(ListenableWorker.Result.success(output))
                    } else {
                        completer.set(ListenableWorker.Result.failure())
                    }
                }

                override fun onFailure(call: retrofit2.Call<List<String>>?, t: Throwable?) {
                    Log.d(TAG, "providesStatesWork.onFailure: $t")

                    if (t != null) {
                        completer.setException(t)
                    }

                    completer.set(ListenableWorker.Result.retry())
                }
            })
        }
    }

    companion object {
        private const val TAG = "NetworkModule"
    }
}