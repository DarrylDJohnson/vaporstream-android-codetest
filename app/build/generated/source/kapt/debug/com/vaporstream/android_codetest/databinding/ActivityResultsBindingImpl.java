package com.vaporstream.android_codetest.databinding;
import com.vaporstream.android_codetest.R;
import com.vaporstream.android_codetest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityResultsBindingImpl extends ActivityResultsBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityResultsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityResultsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewAddressOne.setTag(null);
        this.textViewAddressTwo.setTag(null);
        this.textViewCity.setTag(null);
        this.textViewFirstName.setTag(null);
        this.textViewLastName.setTag(null);
        this.textViewPhoneNumber.setTag(null);
        this.textViewState.setTag(null);
        this.textViewZipCode.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewmodel((com.vaporstream.android_codetest.viewmodel.user.UserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.vaporstream.android_codetest.viewmodel.user.UserViewModel Viewmodel) {
        updateRegistration(1, Viewmodel);
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelUser((androidx.lifecycle.LiveData<com.vaporstream.android_codetest.model.User>) object, fieldId);
            case 1 :
                return onChangeViewmodel((com.vaporstream.android_codetest.viewmodel.user.UserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelUser(androidx.lifecycle.LiveData<com.vaporstream.android_codetest.model.User> ViewmodelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodel(com.vaporstream.android_codetest.viewmodel.user.UserViewModel Viewmodel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.vaporstream.android_codetest.model.User viewmodelUserGetValue = null;
        androidx.lifecycle.LiveData<com.vaporstream.android_codetest.model.User> viewmodelUser = null;
        java.lang.String viewmodelUserState = null;
        java.lang.String viewmodelUserCity = null;
        java.lang.String viewmodelUserAddressTwo = null;
        java.lang.String viewmodelUserAddressOne = null;
        java.lang.String viewmodelUserFirstName = null;
        java.lang.String viewmodelUserLastName = null;
        java.lang.String viewmodelUserZipCode = null;
        java.lang.String viewmodelUserPhoneNumber = null;
        com.vaporstream.android_codetest.viewmodel.user.UserViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.user
                    viewmodelUser = viewmodel.getUser();
                }
                updateLiveDataRegistration(0, viewmodelUser);


                if (viewmodelUser != null) {
                    // read viewmodel.user.getValue()
                    viewmodelUserGetValue = viewmodelUser.getValue();
                }


                if (viewmodelUserGetValue != null) {
                    // read viewmodel.user.getValue().state
                    viewmodelUserState = viewmodelUserGetValue.getState();
                    // read viewmodel.user.getValue().city
                    viewmodelUserCity = viewmodelUserGetValue.getCity();
                    // read viewmodel.user.getValue().addressTwo
                    viewmodelUserAddressTwo = viewmodelUserGetValue.getAddressTwo();
                    // read viewmodel.user.getValue().addressOne
                    viewmodelUserAddressOne = viewmodelUserGetValue.getAddressOne();
                    // read viewmodel.user.getValue().firstName
                    viewmodelUserFirstName = viewmodelUserGetValue.getFirstName();
                    // read viewmodel.user.getValue().lastName
                    viewmodelUserLastName = viewmodelUserGetValue.getLastName();
                    // read viewmodel.user.getValue().zipCode
                    viewmodelUserZipCode = viewmodelUserGetValue.getZipCode();
                    // read viewmodel.user.getValue().phoneNumber
                    viewmodelUserPhoneNumber = viewmodelUserGetValue.getPhoneNumber();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewAddressOne, viewmodelUserAddressOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewAddressTwo, viewmodelUserAddressTwo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewCity, viewmodelUserCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewFirstName, viewmodelUserFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewLastName, viewmodelUserLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewPhoneNumber, viewmodelUserPhoneNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewState, viewmodelUserState);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewZipCode, viewmodelUserZipCode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.user
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}