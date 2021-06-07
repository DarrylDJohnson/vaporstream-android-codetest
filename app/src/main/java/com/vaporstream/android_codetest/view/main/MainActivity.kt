package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.databinding.ActivityMainBinding
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
            viewModel.submit {
                if (it != null) {
                    val resultsIntent = Intent(this, ResultsActivity::class.java)
                    resultsIntent.putExtra("uid", it)
                    startActivity(resultsIntent)
                } else {
                    val snackBar = Snackbar.make(binding.root, "Submission failed", Snackbar.LENGTH_LONG).setAction("Action", null)
                    snackBar.show()
                }
            }
        }
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}