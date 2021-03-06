package com.vaporstream.android_codetest.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.vaporstream.android_codetest.model.User;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDatabaseDao_Impl implements UserDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public UserDatabaseDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_table` (`uid`,`first_name`,`last_name`,`phone_number`,`address_one`,`address_two`,`city`,`state`,`zip_code`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getUid() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getUid());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLastName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPhoneNumber());
        }
        if (value.getAddressOne() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAddressOne());
        }
        if (value.getAddressTwo() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getAddressTwo());
        }
        if (value.getCity() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCity());
        }
        if (value.getState() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getState());
        }
        if (value.getZipCode() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getZipCode());
        }
      }
    };
  }

  @Override
  public long insert(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object get(final long key, final Continuation<? super User> p1) {
    final String _sql = "SELECT * from user_table WHERE uid = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "last_name");
          final int _cursorIndexOfPhoneNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
          final int _cursorIndexOfAddressOne = CursorUtil.getColumnIndexOrThrow(_cursor, "address_one");
          final int _cursorIndexOfAddressTwo = CursorUtil.getColumnIndexOrThrow(_cursor, "address_two");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfZipCode = CursorUtil.getColumnIndexOrThrow(_cursor, "zip_code");
          final User _result;
          if(_cursor.moveToFirst()) {
            final Long _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getLong(_cursorIndexOfUid);
            }
            final String _tmpFirstName;
            if (_cursor.isNull(_cursorIndexOfFirstName)) {
              _tmpFirstName = null;
            } else {
              _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            }
            final String _tmpLastName;
            if (_cursor.isNull(_cursorIndexOfLastName)) {
              _tmpLastName = null;
            } else {
              _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            }
            final String _tmpPhoneNumber;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhoneNumber = null;
            } else {
              _tmpPhoneNumber = _cursor.getString(_cursorIndexOfPhoneNumber);
            }
            final String _tmpAddressOne;
            if (_cursor.isNull(_cursorIndexOfAddressOne)) {
              _tmpAddressOne = null;
            } else {
              _tmpAddressOne = _cursor.getString(_cursorIndexOfAddressOne);
            }
            final String _tmpAddressTwo;
            if (_cursor.isNull(_cursorIndexOfAddressTwo)) {
              _tmpAddressTwo = null;
            } else {
              _tmpAddressTwo = _cursor.getString(_cursorIndexOfAddressTwo);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final String _tmpZipCode;
            if (_cursor.isNull(_cursorIndexOfZipCode)) {
              _tmpZipCode = null;
            } else {
              _tmpZipCode = _cursor.getString(_cursorIndexOfZipCode);
            }
            _result = new User(_tmpUid,_tmpFirstName,_tmpLastName,_tmpPhoneNumber,_tmpAddressOne,_tmpAddressTwo,_tmpCity,_tmpState,_tmpZipCode);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
