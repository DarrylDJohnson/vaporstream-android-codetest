package com.vaporstream.android_codetest.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"}, d2 = {"PHONE_REGEX", "", "ZIP_CODE_REGEX", "app_debug"})
public final class RegexKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PHONE_REGEX = "^(\\+1\\s?)?((\\(\\d{3}\\)\\s?)|(\\d{3})(\\s|-?))(\\d{3}(\\s|-?))(\\d{4})$";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ZIP_CODE_REGEX = "^\\d{5}(?:[-\\s]\\d{4})?$";
}