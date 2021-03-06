// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import androidx.lifecycle.MutableLiveData;
import androidx.work.Data;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserModule_ProvideUserWorkerInputDataFactory implements Factory<MutableLiveData<Data>> {
  private final UserModule module;

  public UserModule_ProvideUserWorkerInputDataFactory(UserModule module) {
    this.module = module;
  }

  @Override
  public MutableLiveData<Data> get() {
    return provideUserWorkerInputData(module);
  }

  public static UserModule_ProvideUserWorkerInputDataFactory create(UserModule module) {
    return new UserModule_ProvideUserWorkerInputDataFactory(module);
  }

  public static MutableLiveData<Data> provideUserWorkerInputData(UserModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserWorkerInputData());
  }
}
