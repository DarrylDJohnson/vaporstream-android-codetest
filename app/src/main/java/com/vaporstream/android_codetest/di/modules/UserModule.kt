package com.vaporstream.android_codetest.di.modules

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.work.Constraints
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.worker.InsertUserWorker
import dagger.Module
import dagger.Provides
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
     * Provides a [MutableLiveData] object of type [Data].
     *
     * User data will be posted to this object from the view model.
     *
     * @returns a [MutableLiveData] object of type [Data], expected to hold user data to be inserted into the UserDatabase
     */
    @Singleton
    @Provides
    fun provideUserWorkerInputData() = MutableLiveData<Data>()


    /**
     * Observes [Data] [LiveData] for newly posted user data values.
     *
     * Builds and Observes a [androidx.work.WorkRequest] of type [InsertUserWorker]
     * to insert user data into the [UserDatabase]
     *
     * Observes a [androidx.work.WorkRequest]'s [androidx.work.WorkInfo] LiveData for newly posted
     * outputs from the [InsertUserWorker] request
     *
     * The info is expected to hold the generated uid returned when a
     * [com.vaporstream.android_codetest.model.User] is inserted into the [UserDatabaseDao].
     *
     * Extracts, converts and posts the uid value to a [LiveData] object of type [Long]
     * 
     * @returns a LiveData object of type Long, expected to hold a uid
     */
    @Singleton
    @Provides
    fun provideUid(data: MutableLiveData<Data>): LiveData<Long> {
        val uidLiveData = MutableLiveData<Long>()

        data.observeForever() {

            val constraints = Constraints.Builder().build()

            val request = OneTimeWorkRequestBuilder<InsertUserWorker>().setConstraints(constraints)
                .setInputData(it).build()

            WorkManager.getInstance(application.applicationContext).enqueue(request)

            WorkManager.getInstance(application.applicationContext)
                .getWorkInfoByIdLiveData(request.id)
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