package com.vaporstream.android_codetest.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDatabase_Impl extends UserDatabase {
  private volatile UserDatabaseDao _userDatabaseDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_table` (`uid` INTEGER PRIMARY KEY AUTOINCREMENT, `first_name` TEXT NOT NULL, `last_name` TEXT NOT NULL, `phone_number` TEXT NOT NULL, `address_one` TEXT NOT NULL, `address_two` TEXT, `city` TEXT NOT NULL, `state` TEXT NOT NULL, `zip_code` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '398b2a6e5afdf7359d85ab907d0f9344')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserTable = new HashMap<String, TableInfo.Column>(9);
        _columnsUserTable.put("uid", new TableInfo.Column("uid", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("first_name", new TableInfo.Column("first_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("last_name", new TableInfo.Column("last_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("phone_number", new TableInfo.Column("phone_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("address_one", new TableInfo.Column("address_one", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("address_two", new TableInfo.Column("address_two", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserTable.put("zip_code", new TableInfo.Column("zip_code", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserTable = new TableInfo("user_table", _columnsUserTable, _foreignKeysUserTable, _indicesUserTable);
        final TableInfo _existingUserTable = TableInfo.read(_db, "user_table");
        if (! _infoUserTable.equals(_existingUserTable)) {
          return new RoomOpenHelper.ValidationResult(false, "user_table(com.vaporstream.android_codetest.model.User).\n"
                  + " Expected:\n" + _infoUserTable + "\n"
                  + " Found:\n" + _existingUserTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "398b2a6e5afdf7359d85ab907d0f9344", "3737356786909a846f5c9a862e454a2b");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDatabaseDao.class, UserDatabaseDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public UserDatabaseDao getUserDatabaseDao() {
    if (_userDatabaseDao != null) {
      return _userDatabaseDao;
    } else {
      synchronized(this) {
        if(_userDatabaseDao == null) {
          _userDatabaseDao = new UserDatabaseDao_Impl(this);
        }
        return _userDatabaseDao;
      }
    }
  }
}
