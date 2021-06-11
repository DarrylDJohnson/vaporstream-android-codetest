package com.vaporstream.android_codetest.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/vaporstream/android_codetest/utilities/Constants;", "", "()V", "ADDRESS_ONE", "", "ADDRESS_TWO", "BASE_URL", "CITY", "FIRST_NAME", "INSERT_USER_FAILED", "", "LAST_NAME", "PHONE_NUMBER", "PHONE_REGEX", "SELECT_A_STATE", "STATE", "STATES_ARRAY", "UID", "ZIP_CODE", "ZIP_CODE_REGEX", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.vaporstream.android_codetest.utilities.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.jsonbin.io/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SELECT_A_STATE = "Select a State";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATES_ARRAY = "states_array_list";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UID = "uid";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_NAME = "first_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_NAME = "last_name";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_NUMBER = "phone_number";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_ONE = "address_one";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS_TWO = "address_two";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CITY = "city";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String STATE = "state";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZIP_CODE = "zip_code";
    public static final long INSERT_USER_FAILED = -1L;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?$";
    
    private Constants() {
        super();
    }
}