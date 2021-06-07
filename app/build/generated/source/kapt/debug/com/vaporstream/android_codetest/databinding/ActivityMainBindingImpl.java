package com.vaporstream.android_codetest.databinding;
import com.vaporstream.android_codetest.R;
import com.vaporstream.android_codetest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding implements com.vaporstream.android_codetest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener editTextAddressOneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addressOne.getValue()
            //         is viewmodel.addressOne.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextAddressOne);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addressOne != null
            boolean viewmodelAddressOneJavaLangObjectNull = false;
            // viewmodel.addressOne
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressOne = null;
            // viewmodel.addressOne.getValue()
            java.lang.String viewmodelAddressOneGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddressOne = viewmodel.getAddressOne();

                viewmodelAddressOneJavaLangObjectNull = (viewmodelAddressOne) != (null);
                if (viewmodelAddressOneJavaLangObjectNull) {




                    viewmodelAddressOne.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextAddressTwoandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.addressTwo.getValue()
            //         is viewmodel.addressTwo.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextAddressTwo);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.addressTwo.getValue()
            java.lang.String viewmodelAddressTwoGetValue = null;
            // viewmodel.addressTwo != null
            boolean viewmodelAddressTwoJavaLangObjectNull = false;
            // viewmodel.addressTwo
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressTwo = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelAddressTwo = viewmodel.getAddressTwo();

                viewmodelAddressTwoJavaLangObjectNull = (viewmodelAddressTwo) != (null);
                if (viewmodelAddressTwoJavaLangObjectNull) {




                    viewmodelAddressTwo.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextCityandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.city.getValue()
            //         is viewmodel.city.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextCity);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.city != null
            boolean viewmodelCityJavaLangObjectNull = false;
            // viewmodel.city
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCity = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;
            // viewmodel.city.getValue()
            java.lang.String viewmodelCityGetValue = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelCity = viewmodel.getCity();

                viewmodelCityJavaLangObjectNull = (viewmodelCity) != (null);
                if (viewmodelCityJavaLangObjectNull) {




                    viewmodelCity.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextFirstNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.firstName.getValue()
            //         is viewmodel.firstName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextFirstName);
            // localize variables for thread safety
            // viewmodel.firstName.getValue()
            java.lang.String viewmodelFirstNameGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.firstName != null
            boolean viewmodelFirstNameJavaLangObjectNull = false;
            // viewmodel.firstName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFirstName = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelFirstName = viewmodel.getFirstName();

                viewmodelFirstNameJavaLangObjectNull = (viewmodelFirstName) != (null);
                if (viewmodelFirstNameJavaLangObjectNull) {




                    viewmodelFirstName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextLastNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.lastName.getValue()
            //         is viewmodel.lastName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextLastName);
            // localize variables for thread safety
            // viewmodel.lastName.getValue()
            java.lang.String viewmodelLastNameGetValue = null;
            // viewmodel.lastName != null
            boolean viewmodelLastNameJavaLangObjectNull = false;
            // viewmodel.lastName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLastName = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLastName = viewmodel.getLastName();

                viewmodelLastNameJavaLangObjectNull = (viewmodelLastName) != (null);
                if (viewmodelLastNameJavaLangObjectNull) {




                    viewmodelLastName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextPhoneNumberandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.phoneNumber.getValue()
            //         is viewmodel.phoneNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextPhoneNumber);
            // localize variables for thread safety
            // viewmodel.phoneNumber.getValue()
            java.lang.String viewmodelPhoneNumberGetValue = null;
            // viewmodel.phoneNumber != null
            boolean viewmodelPhoneNumberJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.phoneNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPhoneNumber = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelPhoneNumber = viewmodel.getPhoneNumber();

                viewmodelPhoneNumberJavaLangObjectNull = (viewmodelPhoneNumber) != (null);
                if (viewmodelPhoneNumberJavaLangObjectNull) {




                    viewmodelPhoneNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener editTextZipcodeandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.zipCode.getValue()
            //         is viewmodel.zipCode.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(editTextZipcode);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.zipCode.getValue()
            java.lang.String viewmodelZipCodeGetValue = null;
            // viewmodel.zipCode != null
            boolean viewmodelZipCodeJavaLangObjectNull = false;
            // viewmodel.zipCode
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelZipCode = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelZipCode = viewmodel.getZipCode();

                viewmodelZipCodeJavaLangObjectNull = (viewmodelZipCode) != (null);
                if (viewmodelZipCodeJavaLangObjectNull) {




                    viewmodelZipCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener spinnerStatesandroidSelectedItemPositionAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.state.getValue()
            //         is viewmodel.state.setValue((java.lang.Integer) callbackArg_0)
            int callbackArg_0 = spinnerStates.getSelectedItemPosition();
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.state
            androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelState = null;
            // viewmodel.state != null
            boolean viewmodelStateJavaLangObjectNull = false;
            // viewmodel.state.getValue()
            java.lang.Integer viewmodelStateGetValue = null;
            // viewmodel
            com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelState = viewmodel.getState();

                viewmodelStateJavaLangObjectNull = (viewmodelState) != (null);
                if (viewmodelStateJavaLangObjectNull) {




                    viewmodelState.setValue(((java.lang.Integer) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[9]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[8]
            , (android.widget.Spinner) bindings[7]
            );
        this.buttonClear.setTag(null);
        this.buttonSubmit.setTag(null);
        this.editTextAddressOne.setTag(null);
        this.editTextAddressTwo.setTag(null);
        this.editTextCity.setTag(null);
        this.editTextFirstName.setTag(null);
        this.editTextLastName.setTag(null);
        this.editTextPhoneNumber.setTag(null);
        this.editTextZipcode.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.spinnerStates.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.vaporstream.android_codetest.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setViewmodel((com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel Viewmodel) {
        updateRegistration(10, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelStatesArray((androidx.databinding.ObservableArrayList<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelLastName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelCity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewmodelState((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewmodelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewmodelZipCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewmodelAddressTwo((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewmodelSubmitEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewmodelAddressOne((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewmodelFirstName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewmodel((com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelStatesArray(androidx.databinding.ObservableArrayList<java.lang.String> ViewmodelStatesArray, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLastName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelCity(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelCity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelState(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewmodelState, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelZipCode(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelZipCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddressTwo(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelAddressTwo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelSubmitEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewmodelSubmitEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelAddressOne(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelAddressOne, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelFirstName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        else if (fieldId == BR.firstName) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        else if (fieldId == BR.lastName) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.phoneNumber) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        else if (fieldId == BR.addressOne) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        else if (fieldId == BR.addressTwo) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.city) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.state) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.zipCode) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.submitEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        int androidxDatabindingViewDataBindingSafeUnboxViewmodelStateGetValue = 0;
        androidx.databinding.ObservableArrayList<java.lang.String> viewmodelStatesArray = null;
        java.lang.String viewmodelFirstNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLastName = null;
        java.lang.String viewmodelZipCodeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelCity = null;
        java.lang.String viewmodelAddressOneGetValue = null;
        java.lang.String viewmodelCityGetValue = null;
        java.lang.String viewmodelPhoneNumberGetValue = null;
        java.lang.Boolean viewmodelSubmitEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewmodelState = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPhoneNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelZipCode = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewmodelSubmitEnabledGetValue = false;
        java.lang.String viewmodelAddressTwoGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressTwo = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewmodelSubmitEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelAddressOne = null;
        java.lang.Integer viewmodelStateGetValue = null;
        java.lang.String viewmodelLastNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFirstName = null;
        com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0xc01L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.statesArray
                        viewmodelStatesArray = viewmodel.getStatesArray();
                    }
                    updateRegistration(0, viewmodelStatesArray);
            }
            if ((dirtyFlags & 0xc02L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lastName
                        viewmodelLastName = viewmodel.getLastName();
                    }
                    updateLiveDataRegistration(1, viewmodelLastName);


                    if (viewmodelLastName != null) {
                        // read viewmodel.lastName.getValue()
                        viewmodelLastNameGetValue = viewmodelLastName.getValue();
                    }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.city
                        viewmodelCity = viewmodel.getCity();
                    }
                    updateLiveDataRegistration(2, viewmodelCity);


                    if (viewmodelCity != null) {
                        // read viewmodel.city.getValue()
                        viewmodelCityGetValue = viewmodelCity.getValue();
                    }
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.state
                        viewmodelState = viewmodel.getState();
                    }
                    updateLiveDataRegistration(3, viewmodelState);


                    if (viewmodelState != null) {
                        // read viewmodel.state.getValue()
                        viewmodelStateGetValue = viewmodelState.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.state.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelStateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelStateGetValue);
            }
            if ((dirtyFlags & 0xc10L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.phoneNumber
                        viewmodelPhoneNumber = viewmodel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(4, viewmodelPhoneNumber);


                    if (viewmodelPhoneNumber != null) {
                        // read viewmodel.phoneNumber.getValue()
                        viewmodelPhoneNumberGetValue = viewmodelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0xc20L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.zipCode
                        viewmodelZipCode = viewmodel.getZipCode();
                    }
                    updateLiveDataRegistration(5, viewmodelZipCode);


                    if (viewmodelZipCode != null) {
                        // read viewmodel.zipCode.getValue()
                        viewmodelZipCodeGetValue = viewmodelZipCode.getValue();
                    }
            }
            if ((dirtyFlags & 0xc40L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addressTwo
                        viewmodelAddressTwo = viewmodel.getAddressTwo();
                    }
                    updateLiveDataRegistration(6, viewmodelAddressTwo);


                    if (viewmodelAddressTwo != null) {
                        // read viewmodel.addressTwo.getValue()
                        viewmodelAddressTwoGetValue = viewmodelAddressTwo.getValue();
                    }
            }
            if ((dirtyFlags & 0xc80L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.submitEnabled
                        viewmodelSubmitEnabled = viewmodel.getSubmitEnabled();
                    }
                    updateLiveDataRegistration(7, viewmodelSubmitEnabled);


                    if (viewmodelSubmitEnabled != null) {
                        // read viewmodel.submitEnabled.getValue()
                        viewmodelSubmitEnabledGetValue = viewmodelSubmitEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewmodel.submitEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewmodelSubmitEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewmodelSubmitEnabledGetValue);
            }
            if ((dirtyFlags & 0xd00L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.addressOne
                        viewmodelAddressOne = viewmodel.getAddressOne();
                    }
                    updateLiveDataRegistration(8, viewmodelAddressOne);


                    if (viewmodelAddressOne != null) {
                        // read viewmodel.addressOne.getValue()
                        viewmodelAddressOneGetValue = viewmodelAddressOne.getValue();
                    }
            }
            if ((dirtyFlags & 0xe00L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.firstName
                        viewmodelFirstName = viewmodel.getFirstName();
                    }
                    updateLiveDataRegistration(9, viewmodelFirstName);


                    if (viewmodelFirstName != null) {
                        // read viewmodel.firstName.getValue()
                        viewmodelFirstNameGetValue = viewmodelFirstName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.buttonClear.setOnClickListener(mCallback1);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAddressOne, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextAddressOneandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextAddressTwo, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextAddressTwoandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextCity, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextCityandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextFirstName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextFirstNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextLastName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextLastNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextPhoneNumber, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextPhoneNumberandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.editTextZipcode, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, editTextZipcodeandroidTextAttrChanged);
            androidx.databinding.adapters.AdapterViewBindingAdapter.setOnItemSelectedListener(this.spinnerStates, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnItemSelected)null, (androidx.databinding.adapters.AdapterViewBindingAdapter.OnNothingSelected)null, spinnerStatesandroidSelectedItemPositionAttrChanged);
        }
        if ((dirtyFlags & 0xc80L) != 0) {
            // api target 1

            this.buttonSubmit.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewmodelSubmitEnabledGetValue);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextAddressOne, viewmodelAddressOneGetValue);
        }
        if ((dirtyFlags & 0xc40L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextAddressTwo, viewmodelAddressTwoGetValue);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextCity, viewmodelCityGetValue);
        }
        if ((dirtyFlags & 0xe00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextFirstName, viewmodelFirstNameGetValue);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextLastName, viewmodelLastNameGetValue);
        }
        if ((dirtyFlags & 0xc10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextPhoneNumber, viewmodelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0xc20L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.editTextZipcode, viewmodelZipCodeGetValue);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            androidx.databinding.adapters.AbsSpinnerBindingAdapter.setEntries(this.spinnerStates, viewmodelStatesArray);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            androidx.databinding.adapters.AdapterViewBindingAdapter.setSelectedItemPosition(this.spinnerStates, androidxDatabindingViewDataBindingSafeUnboxViewmodelStateGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewmodel != null
        boolean viewmodelJavaLangObjectNull = false;
        // viewmodel
        com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel viewmodel = mViewmodel;



        viewmodelJavaLangObjectNull = (viewmodel) != (null);
        if (viewmodelJavaLangObjectNull) {


            viewmodel.clear();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.statesArray
        flag 1 (0x2L): viewmodel.lastName
        flag 2 (0x3L): viewmodel.city
        flag 3 (0x4L): viewmodel.state
        flag 4 (0x5L): viewmodel.phoneNumber
        flag 5 (0x6L): viewmodel.zipCode
        flag 6 (0x7L): viewmodel.addressTwo
        flag 7 (0x8L): viewmodel.submitEnabled
        flag 8 (0x9L): viewmodel.addressOne
        flag 9 (0xaL): viewmodel.firstName
        flag 10 (0xbL): viewmodel
        flag 11 (0xcL): null
    flag mapping end*/
    //end
}