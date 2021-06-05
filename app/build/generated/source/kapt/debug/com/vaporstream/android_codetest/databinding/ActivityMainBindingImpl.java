package com.vaporstream.android_codetest.databinding;
import com.vaporstream.android_codetest.R;
import com.vaporstream.android_codetest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.spinner_states, 8);
        sViewsWithIds.put(R.id.button_submit, 9);
        sViewsWithIds.put(R.id.button_clear, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextAddressOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addressOneInput.getValue()
            //         is viewmodel.addressOneInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextAddressOne);
            // localize variables for thread safety
            // viewmodel.addressOneInput != null
            boolean viewmodelAddressOneInputJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addressOneInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressOneInput = null;
            // viewmodel.addressOneInput.getValue()
            java.lang.String viewmodelAddressOneInputGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddressOneInput = viewmodel.getAddressOneInput();

                viewmodelAddressOneInputJavaLangObjectNull = (viewmodelAddressOneInput) != (null);
                if (viewmodelAddressOneInputJavaLangObjectNull) {




                    viewmodelAddressOneInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextAddressTwoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addressTwoInput.getValue()
            //         is viewmodel.addressTwoInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextAddressTwo);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addressTwoInput.getValue()
            java.lang.String viewmodelAddressTwoInputGetValue = null;
            // viewmodel.addressTwoInput != null
            boolean viewmodelAddressTwoInputJavaLangObjectNull = false;
            // viewmodel.addressTwoInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressTwoInput = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddressTwoInput = viewmodel.getAddressTwoInput();

                viewmodelAddressTwoInputJavaLangObjectNull = (viewmodelAddressTwoInput) != (null);
                if (viewmodelAddressTwoInputJavaLangObjectNull) {




                    viewmodelAddressTwoInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextCityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.cityInput.getValue()
            //         is viewmodel.cityInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextCity);
            // localize variables for thread safety
            // viewmodel.cityInput != null
            boolean viewmodelCityInputJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.cityInput.getValue()
            java.lang.String viewmodelCityInputGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;
            // viewmodel.cityInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCityInput = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCityInput = viewmodel.getCityInput();

                viewmodelCityInputJavaLangObjectNull = (viewmodelCityInput) != (null);
                if (viewmodelCityInputJavaLangObjectNull) {




                    viewmodelCityInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.firstNameInput.getValue()
            //         is viewmodel.firstNameInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextFirstName);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.firstNameInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFirstNameInput = null;
            // viewmodel.firstNameInput.getValue()
            java.lang.String viewmodelFirstNameInputGetValue = null;
            // viewmodel.firstNameInput != null
            boolean viewmodelFirstNameInputJavaLangObjectNull = false;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelFirstNameInput = viewmodel.getFirstNameInput();

                viewmodelFirstNameInputJavaLangObjectNull = (viewmodelFirstNameInput) != (null);
                if (viewmodelFirstNameInputJavaLangObjectNull) {




                    viewmodelFirstNameInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.lastNameInput.getValue()
            //         is viewmodel.lastNameInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextLastName);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.lastNameInput != null
            boolean viewmodelLastNameInputJavaLangObjectNull = false;
            // viewmodel.lastNameInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLastNameInput = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;
            // viewmodel.lastNameInput.getValue()
            java.lang.String viewmodelLastNameInputGetValue = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLastNameInput = viewmodel.getLastNameInput();

                viewmodelLastNameInputJavaLangObjectNull = (viewmodelLastNameInput) != (null);
                if (viewmodelLastNameInputJavaLangObjectNull) {




                    viewmodelLastNameInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.phoneNumberInput.getValue()
            //         is viewmodel.phoneNumberInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPhoneNumber);
            // localize variables for thread safety
            // viewmodel.phoneNumberInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPhoneNumberInput = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.phoneNumberInput != null
            boolean viewmodelPhoneNumberInputJavaLangObjectNull = false;
            // viewmodel.phoneNumberInput.getValue()
            java.lang.String viewmodelPhoneNumberInputGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelPhoneNumberInput = viewmodel.getPhoneNumberInput();

                viewmodelPhoneNumberInputJavaLangObjectNull = (viewmodelPhoneNumberInput) != (null);
                if (viewmodelPhoneNumberInputJavaLangObjectNull) {




                    viewmodelPhoneNumberInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextZipcodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.zipCodeInput.getValue()
            //         is viewmodel.zipCodeInput.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextZipcode);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.zipCodeInput != null
            boolean viewmodelZipCodeInputJavaLangObjectNull = false;
            // viewmodel.zipCodeInput
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelZipCodeInput = null;
            // viewmodel.zipCodeInput.getValue()
            java.lang.String viewmodelZipCodeInputGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelZipCodeInput = viewmodel.getZipCodeInput();

                viewmodelZipCodeInputJavaLangObjectNull = (viewmodelZipCodeInput) != (null);
                if (viewmodelZipCodeInputJavaLangObjectNull) {




                    viewmodelZipCodeInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[9]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[7]
            , (android.widget.Spinner) bindings[8]
            );
        this.editTextAddressOne.setTag(null);
        this.editTextAddressTwo.setTag(null);
        this.editTextCity.setTag(null);
        this.editTextFirstName.setTag(null);
        this.editTextLastName.setTag(null);
        this.editTextPhoneNumber.setTag(null);
        this.editTextZipcode.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewmodel == variableId) {
            setViewmodel((com.vaporstream.android_codetest.viewmodel.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.vaporstream.android_codetest.viewmodel.UserViewModel Viewmodel) {
        updateRegistration(7, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelPhoneNumberInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelAddressOneInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelAddressTwoInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelZipCodeInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewmodelCityInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelFirstNameInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelLastNameInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodel((com.vaporstream.android_codetest.viewmodel.UserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelPhoneNumberInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelPhoneNumberInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddressOneInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelAddressOneInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddressTwoInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelAddressTwoInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelZipCodeInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelZipCodeInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCityInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCityInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelFirstNameInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelFirstNameInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLastNameInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelLastNameInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.vaporstream.android_codetest.viewmodel.UserViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.firstNameInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.lastNameInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.phoneNumberInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.addressOneInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.addressTwoInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.cityInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.zipCodeInput) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPhoneNumberInput = null;
        java.lang.String viewmodelFirstNameInputGetValue = null;
        java.lang.String viewmodelPhoneNumberInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressOneInput = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressTwoInput = null;
        java.lang.String viewmodelCityInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelZipCodeInput = null;
        java.lang.String viewmodelAddressTwoInputGetValue = null;
        java.lang.String viewmodelZipCodeInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCityInput = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFirstNameInput = null;
        java.lang.String viewmodelAddressOneInputGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLastNameInput = null;
        com.vaporstream.android_codetest.viewmodel.UserViewModel viewmodel = mViewmodel;
        java.lang.String viewmodelLastNameInputGetValue = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.phoneNumberInput
                        viewmodelPhoneNumberInput = viewmodel.getPhoneNumberInput();
                    }
                    updateLiveDataRegistration(0, viewmodelPhoneNumberInput);


                    if (viewmodelPhoneNumberInput != null) {
                        // read viewmodel.phoneNumberInput.getValue()
                        viewmodelPhoneNumberInputGetValue = viewmodelPhoneNumberInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addressOneInput
                        viewmodelAddressOneInput = viewmodel.getAddressOneInput();
                    }
                    updateLiveDataRegistration(1, viewmodelAddressOneInput);


                    if (viewmodelAddressOneInput != null) {
                        // read viewmodel.addressOneInput.getValue()
                        viewmodelAddressOneInputGetValue = viewmodelAddressOneInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addressTwoInput
                        viewmodelAddressTwoInput = viewmodel.getAddressTwoInput();
                    }
                    updateLiveDataRegistration(2, viewmodelAddressTwoInput);


                    if (viewmodelAddressTwoInput != null) {
                        // read viewmodel.addressTwoInput.getValue()
                        viewmodelAddressTwoInputGetValue = viewmodelAddressTwoInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.zipCodeInput
                        viewmodelZipCodeInput = viewmodel.getZipCodeInput();
                    }
                    updateLiveDataRegistration(3, viewmodelZipCodeInput);


                    if (viewmodelZipCodeInput != null) {
                        // read viewmodel.zipCodeInput.getValue()
                        viewmodelZipCodeInputGetValue = viewmodelZipCodeInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.cityInput
                        viewmodelCityInput = viewmodel.getCityInput();
                    }
                    updateLiveDataRegistration(4, viewmodelCityInput);


                    if (viewmodelCityInput != null) {
                        // read viewmodel.cityInput.getValue()
                        viewmodelCityInputGetValue = viewmodelCityInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.firstNameInput
                        viewmodelFirstNameInput = viewmodel.getFirstNameInput();
                    }
                    updateLiveDataRegistration(5, viewmodelFirstNameInput);


                    if (viewmodelFirstNameInput != null) {
                        // read viewmodel.firstNameInput.getValue()
                        viewmodelFirstNameInputGetValue = viewmodelFirstNameInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lastNameInput
                        viewmodelLastNameInput = viewmodel.getLastNameInput();
                    }
                    updateLiveDataRegistration(6, viewmodelLastNameInput);


                    if (viewmodelLastNameInput != null) {
                        // read viewmodel.lastNameInput.getValue()
                        viewmodelLastNameInputGetValue = viewmodelLastNameInput.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextAddressOne, viewmodelAddressOneInputGetValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAddressOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextAddressOneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAddressTwo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextAddressTwoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextCity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextCityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPhoneNumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextZipcode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextZipcodeandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextAddressTwo, viewmodelAddressTwoInputGetValue);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextCity, viewmodelCityInputGetValue);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextFirstName, viewmodelFirstNameInputGetValue);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextLastName, viewmodelLastNameInputGetValue);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPhoneNumber, viewmodelPhoneNumberInputGetValue);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextZipcode, viewmodelZipCodeInputGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.phoneNumberInput
        flag 1 (0x2L): viewmodel.addressOneInput
        flag 2 (0x3L): viewmodel.addressTwoInput
        flag 3 (0x4L): viewmodel.zipCodeInput
        flag 4 (0x5L): viewmodel.cityInput
        flag 5 (0x6L): viewmodel.firstNameInput
        flag 6 (0x7L): viewmodel.lastNameInput
        flag 7 (0x8L): viewmodel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}