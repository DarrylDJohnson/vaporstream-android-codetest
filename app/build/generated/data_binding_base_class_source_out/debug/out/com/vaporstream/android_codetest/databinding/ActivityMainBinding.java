// Generated by data binding compiler. Do not edit!
package com.vaporstream.android_codetest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.vaporstream.android_codetest.R;
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final Button buttonClear;

  @NonNull
  public final Button buttonSubmit;

  @NonNull
  public final EditText editTextAddressOne;

  @NonNull
  public final EditText editTextAddressTwo;

  @NonNull
  public final EditText editTextCity;

  @NonNull
  public final EditText editTextFirstName;

  @NonNull
  public final EditText editTextLastName;

  @NonNull
  public final EditText editTextPhoneNumber;

  @NonNull
  public final EditText editTextZipcode;

  @NonNull
  public final Spinner spinnerStates;

  @Bindable
  protected MainActivityViewModel mViewmodel;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button buttonClear, Button buttonSubmit, EditText editTextAddressOne,
      EditText editTextAddressTwo, EditText editTextCity, EditText editTextFirstName,
      EditText editTextLastName, EditText editTextPhoneNumber, EditText editTextZipcode,
      Spinner spinnerStates) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonClear = buttonClear;
    this.buttonSubmit = buttonSubmit;
    this.editTextAddressOne = editTextAddressOne;
    this.editTextAddressTwo = editTextAddressTwo;
    this.editTextCity = editTextCity;
    this.editTextFirstName = editTextFirstName;
    this.editTextLastName = editTextLastName;
    this.editTextPhoneNumber = editTextPhoneNumber;
    this.editTextZipcode = editTextZipcode;
    this.spinnerStates = spinnerStates;
  }

  public abstract void setViewmodel(@Nullable MainActivityViewModel viewmodel);

  @Nullable
  public MainActivityViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
