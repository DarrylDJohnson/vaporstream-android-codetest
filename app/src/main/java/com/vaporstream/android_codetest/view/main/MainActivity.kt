package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModelProvider
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.databinding.ActivityMainBinding
import com.vaporstream.android_codetest.di.Injector
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.view.results.ResultsActivity
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var uid: LiveData<Long>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Injector.getComponent().inject(this)

        // ViewModel
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        // Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        /** observes a LiveData object of type Long expected to hold a uid generated when
         * a user is inserted into the UserDatabaseDao.
         */
        uid.observe(this) {
            if (it != -1L) {
                val resultsIntent = Intent(this, ResultsActivity::class.java)
                resultsIntent.putExtra(Constants.UID, it)
                startActivity(resultsIntent)
            }
        }
    }
}