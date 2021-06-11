package com.vaporstream.android_codetest.di.modules

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.WorkManager
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.utilities.Constants
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class UserModule(private val application: Application) {

    @Provides
    fun provideUserDatabaseDao(): UserDatabaseDao =
        UserDatabase.getInstance(application).userDatabaseDao

    @Singleton
    @Provides
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()


    /**
     * Provides a [MutableLiveData] object of type [UUID].
     *
     * @returns a [MutableLiveData] object of type [UUID], expected to hold a [androidx.work.WorkRequest] id
     */
    @Singleton
    @Provides
    fun provideUserWorkerRequestId(): MutableLiveData<UUID> = MutableLiveData<UUID>()

    /**
     * Observes [workerRequestId] [LiveData] for newly posted values.
     * Accesses a [androidx.work.WorkRequest] via the newly posted [workerRequestId] value.
     *
     * Observes a [androidx.work.WorkRequest]'s [androidx.work.WorkInfo] LiveData for newly posted info.
     * The info is expected to hold the generated uid returned when a [com.vaporstream.android_codetest.model.User]
     * is inserted into the [UserDatabaseDao].
     *
     * Extracts, converts and posts the uid value to a [LiveData] object of type [Long]
     * @returns a LiveData object of type Long, expected to hold a uid
     */
    @Singleton
    @Provides
    fun provideUid(workerRequestId: MutableLiveData<UUID>): LiveData<Long> {
        val uidLiveData = MutableLiveData<Long>()

        workerRequestId.observeForever() {

            WorkManager.getInstance(application.applicationContext)
                .getWorkInfoByIdLiveData(it)
                .observeForever { info ->  //ObserveForever can present issues as it is not tied to a Lifecycle
                    if (info != null && info.state.isFinished) {

                        /**
                         * [Constants.INSERT_USER_FAILED] = -1L
                         *
                         * The default workInfo output value is set to [Constants.INSERT_USER_FAILED]
                         * since the RoomDatabase does generate negative ids. Therefore, a negative
                         * value cannot represent a valid uid
                         */
                        uidLiveData.value =
                            info.outputData.getLong(Constants.UID, Constants.INSERT_USER_FAILED)
                    }
                }
        }

        return uidLiveData
    }
}