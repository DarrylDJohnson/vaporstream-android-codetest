package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.work.WorkManager
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
    lateinit var workManager: WorkManager

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
        binding.buttonSubmit.setOnClickListener {
            val requestId = viewModel.submit()

            workManager.getWorkInfoByIdLiveData(requestId).observe(this) {

                if (it.state.isFinished) {
                    val uid = it.outputData.getLong(Constants.UID, -1)

                    startActivity(
                        Intent(this, ResultsActivity::class.java)
                            .apply { putExtra(Constants.UID, uid) }
                    )
                }
            }
        }
    }
}