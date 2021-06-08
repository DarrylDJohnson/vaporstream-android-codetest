package com.vaporstream.android_codetest.utilities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData

fun <T> MediatorLiveData<T>.addSources(vararg sources: LiveData<out Any>, onChanged: (Any) -> Unit) {
    sources.forEach { this.addSource(it, onChanged) }
}

fun String?.isNotNullOrBlank() = !this.isNullOrBlank()

fun String?.matchesZipCode() = this?.toRegex()?.matches(Constants.ZIP_CODE_REGEX)?: false
fun String?.matchesPhoneNumber() = this?.toRegex()?.matches(Constants.PHONE_REGEX)?: false