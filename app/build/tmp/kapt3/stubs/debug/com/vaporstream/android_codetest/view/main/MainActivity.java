package com.vaporstream.android_codetest.view.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/vaporstream/android_codetest/view/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/vaporstream/android_codetest/databinding/ActivityMainBinding;", "viewModel", "Lcom/vaporstream/android_codetest/viewmodel/main/MainActivityViewModel;", "workManager", "Landroidx/work/WorkManager;", "getWorkManager", "()Landroidx/work/WorkManager;", "setWorkManager", "(Landroidx/work/WorkManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewModel;
    private com.vaporstream.android_codetest.databinding.ActivityMainBinding binding;
    @javax.inject.Inject()
    public androidx.work.WorkManager workManager;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.work.WorkManager getWorkManager() {
        return null;
    }
    
    public final void setWorkManager(@org.jetbrains.annotations.NotNull()
    androidx.work.WorkManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}