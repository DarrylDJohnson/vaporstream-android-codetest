// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.UUID;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserModule_ProvideUidFactory implements Factory<LiveData<Long>> {
  private final UserModule module;

  private final Provider<MutableLiveData<UUID>> workerRequestIdProvider;

  public UserModule_ProvideUidFactory(UserModule module,
      Provider<MutableLiveData<UUID>> workerRequestIdProvider) {
    this.module = module;
    this.workerRequestIdProvider = workerRequestIdProvider;
  }

  @Override
  public LiveData<Long> get() {
    return provideUid(module, workerRequestIdProvider.get());
  }

  public static UserModule_ProvideUidFactory create(UserModule module,
      Provider<MutableLiveData<UUID>> workerRequestIdProvider) {
    return new UserModule_ProvideUidFactory(module, workerRequestIdProvider);
  }

  public static LiveData<Long> provideUid(UserModule instance,
      MutableLiveData<UUID> workerRequestId) {
    return Preconditions.checkNotNullFromProvides(instance.provideUid(workerRequestId));
  }
}