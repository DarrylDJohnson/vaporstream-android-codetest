// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import com.vaporstream.android_codetest.database.UserDatabaseDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserModule_ProvideUserDatabaseDaoFactory implements Factory<UserDatabaseDao> {
  private final UserModule module;

  public UserModule_ProvideUserDatabaseDaoFactory(UserModule module) {
    this.module = module;
  }

  @Override
  public UserDatabaseDao get() {
    return provideUserDatabaseDao(module);
  }

  public static UserModule_ProvideUserDatabaseDaoFactory create(UserModule module) {
    return new UserModule_ProvideUserDatabaseDaoFactory(module);
  }

  public static UserDatabaseDao provideUserDatabaseDao(UserModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserDatabaseDao());
  }
}
