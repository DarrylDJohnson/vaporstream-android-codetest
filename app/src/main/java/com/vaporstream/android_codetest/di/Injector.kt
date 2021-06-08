package com.vaporstream.android_codetest.di

import com.vaporstream.android_codetest.MyApplication

class Injector private constructor() {
    companion object {
        @JvmStatic
        fun getComponent(): ApplicationComponent = MyApplication.get().applicationComponent
    }
}