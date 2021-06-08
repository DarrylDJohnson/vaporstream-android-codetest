package com.vaporstream.android_codetest.worker

import android.content.Context
import android.util.Log
import androidx.concurrent.futures.CallbackToFutureAdapter
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.google.common.util.concurrent.ListenableFuture
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.utilities.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.concurrent.Executor
import javax.inject.Inject

class GetStatesWorker(context: Context, params: WorkerParameters) :
    ListenableWorker(context, params) {

    @Inject
    lateinit var statesWork: ListenableFuture<Result>

    init {
        Injector.getComponent().inject(this)
    }

    override fun startWork(): ListenableFuture<Result> = statesWork
}

