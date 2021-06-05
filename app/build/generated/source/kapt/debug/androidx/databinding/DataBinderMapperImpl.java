package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.vaporstream.android_codetest.DataBinderMapperImpl());
  }
}
