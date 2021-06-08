package com.vaporstream.android_codetest.worker

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.utilities.StatesInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class GetStatesWorker(context: Context, params: WorkerParameters) :
    Worker(context, params) {

    @Inject
    lateinit var statesInterface: StatesInterface

    init {
        Injector.getComponent().inject(this)
    }


    override fun doWork(): Result {

        val states = ArrayList<String>()
        states.add(Constants.SELECT_A_STATE)

        statesInterface.getStates().enqueue(
            object : Callback<List<String>> {
                override fun onResponse(
                    call: Call<List<String>>?,
                    response: Response<List<String>>?
                ) {
                    if (response != null && response.isSuccessful) {
                        states.addAll(response.body())
                    }
                }

                override fun onFailure(call: Call<List<String>>?, t: Throwable?) {}
            }
        )

        if (states.size == 1)
            return Result.retry()

        val output = workDataOf(Constants.STATES_ARRAY_LIST to states.toArray())

        return Result.success(output)
    }
}
