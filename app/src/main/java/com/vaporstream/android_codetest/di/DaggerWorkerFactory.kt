package com.vaporstream.android_codetest.di

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface DaggerWorkerFactory {
    fun create(context: Context, params: WorkerParameters): ListenableWorker
}