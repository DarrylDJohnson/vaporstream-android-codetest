// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.viewmodel.main;

import com.vaporstream.android_codetest.repository.UserRepository;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_MembersInjector implements MembersInjector<MainActivityViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public MainActivityViewModel_MembersInjector(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  public static MembersInjector<MainActivityViewModel> create(
      Provider<UserRepository> userRepositoryProvider) {
    return new MainActivityViewModel_MembersInjector(userRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivityViewModel instance) {
    injectUserRepository(instance, userRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel.userRepository")
  public static void injectUserRepository(MainActivityViewModel instance,
      UserRepository userRepository) {
    instance.userRepository = userRepository;
  }
}