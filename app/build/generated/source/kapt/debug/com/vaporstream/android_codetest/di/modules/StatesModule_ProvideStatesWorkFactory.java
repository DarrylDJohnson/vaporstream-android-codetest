// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatesModule_ProvideStatesWorkFactory implements Factory<ListenableFuture<ListenableWorker.Result>> {
  private final StatesModule module;

  private final Provider<StatesModule.StatesInterface> statesInterfaceProvider;

  public StatesModule_ProvideStatesWorkFactory(StatesModule module,
      Provider<StatesModule.StatesInterface> statesInterfaceProvider) {
    this.module = module;
    this.statesInterfaceProvider = statesInterfaceProvider;
  }

  @Override
  public ListenableFuture<ListenableWorker.Result> get() {
    return provideStatesWork(module, statesInterfaceProvider.get());
  }

  public static StatesModule_ProvideStatesWorkFactory create(StatesModule module,
      Provider<StatesModule.StatesInterface> statesInterfaceProvider) {
    return new StatesModule_ProvideStatesWorkFactory(module, statesInterfaceProvider);
  }

  public static ListenableFuture<ListenableWorker.Result> provideStatesWork(StatesModule instance,
      StatesModule.StatesInterface statesInterface) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatesWork(statesInterface));
  }
}
