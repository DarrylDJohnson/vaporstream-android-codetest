package com.vaporstream.android_codetest.worker

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters
import com.google.common.util.concurrent.ListenableFuture
import com.vaporstream.android_codetest.di.Injector
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

