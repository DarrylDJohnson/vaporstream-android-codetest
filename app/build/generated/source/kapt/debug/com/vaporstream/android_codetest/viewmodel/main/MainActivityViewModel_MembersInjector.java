// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.viewmodel.main;

import androidx.lifecycle.LiveData;
import androidx.work.WorkManager;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_MembersInjector implements MembersInjector<MainActivityViewModel> {
  private final Provider<WorkManager> workManagerProvider;

  private final Provider<LiveData<String[]>> statesProvider;

  public MainActivityViewModel_MembersInjector(Provider<WorkManager> workManagerProvider,
      Provider<LiveData<String[]>> statesProvider) {
    this.workManagerProvider = workManagerProvider;
    this.statesProvider = statesProvider;
  }

  public static MembersInjector<MainActivityViewModel> create(
      Provider<WorkManager> workManagerProvider, Provider<LiveData<String[]>> statesProvider) {
    return new MainActivityViewModel_MembersInjector(workManagerProvider, statesProvider);
  }

  @Override
  public void injectMembers(MainActivityViewModel instance) {
    injectWorkManager(instance, workManagerProvider.get());
    injectStates(instance, statesProvider.get());
  }

  @InjectedFieldSignature("com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel.workManager")
  public static void injectWorkManager(MainActivityViewModel instance, WorkManager workManager) {
    instance.workManager = workManager;
  }

  @InjectedFieldSignature("com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel.states")
  public static void injectStates(MainActivityViewModel instance, LiveData<String[]> states) {
    instance.states = states;
  }
}
