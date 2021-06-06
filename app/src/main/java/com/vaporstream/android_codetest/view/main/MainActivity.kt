package com.vaporstream.android_codetest.view.main

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
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

        //ViewModel
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        //Data Binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel

        //Set Spinner Adapter
        val statesAdapter = ArrayAdapter.createFromResource(this, R.array.states_array, android.R.layout.simple_spinner_dropdown_item)
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerStates.adapter = statesAdapter

        //Set button onClickListeners buttons
        binding.buttonClear.setOnClickListener { viewModel.clear() }
        binding.buttonSubmit.setOnClickListener { viewModel.submit() }
    }

    private fun submitForm() {
        val resultsIntent = Intent(this, ResultsActivity::class.java)
        startActivity(resultsIntent)
    }
}