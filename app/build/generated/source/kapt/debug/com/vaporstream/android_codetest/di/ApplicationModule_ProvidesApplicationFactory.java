// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di;

import com.vaporstream.android_codetest.MyApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvidesApplicationFactory implements Factory<MyApplication> {
  private final ApplicationModule module;

  public ApplicationModule_ProvidesApplicationFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public MyApplication get() {
    return providesApplication(module);
  }

  public static ApplicationModule_ProvidesApplicationFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvidesApplicationFactory(module);
  }

  public static MyApplication providesApplication(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.providesApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}