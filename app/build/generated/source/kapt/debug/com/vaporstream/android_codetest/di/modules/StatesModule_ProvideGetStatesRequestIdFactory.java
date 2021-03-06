// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.UUID;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatesModule_ProvideGetStatesRequestIdFactory implements Factory<UUID> {
  private final StatesModule module;

  public StatesModule_ProvideGetStatesRequestIdFactory(StatesModule module) {
    this.module = module;
  }

  @Override
  public UUID get() {
    return provideGetStatesRequestId(module);
  }

  public static StatesModule_ProvideGetStatesRequestIdFactory create(StatesModule module) {
    return new StatesModule_ProvideGetStatesRequestIdFactory(module);
  }

  public static UUID provideGetStatesRequestId(StatesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideGetStatesRequestId());
  }
}
