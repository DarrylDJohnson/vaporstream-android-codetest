// Generated by Dagger (https://dagger.dev).
package com.vaporstream.android_codetest.di.modules;

import androidx.work.WorkManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WorkerModule_ProvideWorkManagerFactory implements Factory<WorkManager> {
  private final WorkerModule module;

  public WorkerModule_ProvideWorkManagerFactory(WorkerModule module) {
    this.module = module;
  }

  @Override
  public WorkManager get() {
    return provideWorkManager(module);
  }

  public static WorkerModule_ProvideWorkManagerFactory create(WorkerModule module) {
    return new WorkerModule_ProvideWorkManagerFactory(module);
  }

  public static WorkManager provideWorkManager(WorkerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWorkManager());
  }
}
