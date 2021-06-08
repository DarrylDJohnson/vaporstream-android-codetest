package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.work.WorkManager
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.databinding.ActivityMainBinding
import com.vaporstream.android_codetest.utilities.Constants
import com.vaporstream.android_codetest.view.results.ResultsActivity
import com.vaporstream.android_codetest.viewmodel.main.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* ViewModel */
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        /* Data Binding */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        binding.buttonSubmit.setOnClickListener {

            val submitId = viewModel.submit()

            WorkManager.getInstance(this).getWorkInfoByIdLiveData(submitId)
                .observe(this, Observer { info ->
                    if (info != null && info.state.isFinished) {
                        val uid = info.outputData.getLong(
                            Constants.UID,
                            -1
                        )                  //-1 because Room Database does not use negative values

                        val resultsIntent = Intent(this, ResultsActivity::class.java)
                        resultsIntent.putExtra(Constants.UID, uid)
                        startActivity(resultsIntent)
                    }
                })
        }
    }
}