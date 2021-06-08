package com.vaporstream.android_codetest

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.database.UserDatabaseDao
import com.vaporstream.android_codetest.model.User
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class UserDatabaseTest {
    private lateinit var userDao: UserDatabaseDao
    private lateinit var db: UserDatabase

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        // Using an in-memory database because the information stored here disappears when the
        // process is killed.
        db = Room.inMemoryDatabaseBuilder(context, UserDatabase::class.java)
                // Allowing main thread queries, just for testing.
                .allowMainThreadQueries()
                .build()
        userDao = db.userDatabaseDao
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun insertAndGetUser() {
        val user = User(
                uid = 123L,
                firstName = "First",
                lastName = "Last",
                phoneNumber = "1234567890",
                addressOne = "123 North Street",
                addressTwo = null,
                city = "City",
                state = "State",
                zipCode = "123456",
        )

        runBlocking {
            launch {
                userDao.insert(user)
            }
        }.invokeOnCompletion {
            val currentUser = userDao.get(123L).asLiveData()
            assertEquals(currentUser.value?.firstName, "First")
        }
    }
}