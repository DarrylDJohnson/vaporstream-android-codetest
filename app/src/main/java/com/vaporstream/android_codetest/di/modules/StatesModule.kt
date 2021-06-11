package com.vaporstream.android_codetest.di.modules

import android.app.Application
import androidx.concurrent.futures.CallbackToFutureAdapter
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.*
import com.google.common.util.concurrent.ListenableFuture
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.worker.GetStatesWorker
import dagger.Module
import dagger.Provides
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.GET
import java.util.*
import javax.inject.Named
import javax.inject.Singleton

@Module
class StatesModule(private val application: Application) {

    interface StatesInterface {
        @GET("/b/60770a3c5b165e19f6201b95")
        fun getStates(): Call<List<String>>
    }

    @Provides
    @Singleton
    fun provideStateInterface(retrofit: Retrofit): StatesInterface {
        return retrofit.create(StatesInterface::class.java)
    }

    /**
     * Queues a work request to retrieve a list of states
     *
     * @returns the UUID of the queued work request
     */
    @Provides
    @Named("StatesWorkerId")
    fun provideGetStatesRequestId(): UUID {

        // Work request requires a Network connection.
        val constraints =
            Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()

        // Build the work request to acquire a request id
        val request =
            OneTimeWorkRequestBuilder<GetStatesWorker>().setConstraints(constraints).build()

        // Queue the work request
        WorkManager.getInstance(application.applicationContext).enqueue(request)

        return request.id
    }

    /**
     * Listens to a Retrofit http request for a string array of states
     *
     * @returns a Completer used to handle the GetStatesWorker Result based on the http request response
     */
    @Provides
    fun provideStatesWork(statesInterface: StatesInterface): ListenableFuture<ListenableWorker.Result> {
        return CallbackToFutureAdapter.getFuture { completer ->
            statesInterface.getStates().enqueue(
                object :
                    Callback<List<String>> {

                    override fun onResponse(
                        call: Call<List<String>>?,
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

                    override fun onFailure(call: Call<List<String>>?, t: Throwable?) {
                        if (t != null) {
                            completer.setException(t)
                        }

                        completer.set(ListenableWorker.Result.retry())
                    }
                },
            )
        }
    }

    /**
     * Transforms WorkInfo as LiveData from a work request, used to retrieve a list of states,
     * with the id [id] into a string array as LiveData
     *
     * @returns string array of retrieved states as LiveData
     */
    @Provides
    @Singleton
    fun provideStates(@Named("StatesWorkerId") id: UUID): LiveData<Array<String>> {
        val statesLiveData = MutableLiveData(emptyArray<String>())

        val workInfo =
            WorkManager.getInstance(application.applicationContext).getWorkInfoByIdLiveData(id)


        workInfo.observeForever {
            if (it != null && it.state.isFinished) {
                statesLiveData.value = it.outputData.getStringArray(Constants.STATES_ARRAY)
            }
        }

        return statesLiveData
    }


}