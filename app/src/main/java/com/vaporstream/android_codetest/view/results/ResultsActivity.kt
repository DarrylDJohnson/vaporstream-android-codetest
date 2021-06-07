package com.vaporstream.android_codetest.view.results

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.database.UserDatabase
import com.vaporstream.android_codetest.databinding.ActivityResultsBinding
import com.vaporstream.android_codetest.repository.UserRepository
import com.vaporstream.android_codetest.repository.UserRepositoryImpl
import com.vaporstream.android_codetest.viewmodel.user.UserViewModel
import com.vaporstream.android_codetest.viewmodel.user.UserViewModelFactory

class ResultsActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel
    private lateinit var repository: UserRepository
    private lateinit var binding: ActivityResultsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val extras = intent.extras
        val uid = extras!!.getLong("uid")

        val repository = UserRepositoryImpl(UserDatabase.getInstance(this).userDatabaseDao)
        val factory = UserViewModelFactory(repository, uid)
        viewModel = ViewModelProvider(this, factory).get(UserViewModel::class.java)

        /* Data Binding*/
        binding = DataBindingUtil.setContentView(this, R.layout.activity_results)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
    }
}