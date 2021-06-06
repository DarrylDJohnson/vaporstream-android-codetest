package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.databinding.ActivityMainBinding
import com.vaporstream.android_codetest.view.results.ResultsActivity
import com.vaporstream.android_codetest.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: UserViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* ViewModel */
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        /* Data Binding */
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        /* Button.onClickListeners */
        binding.buttonClear.setOnClickListener { viewModel.clear() }
    }

    private fun submitForm() {
        val resultsIntent = Intent(this, ResultsActivity::class.java)
        startActivity(resultsIntent)
    }
}