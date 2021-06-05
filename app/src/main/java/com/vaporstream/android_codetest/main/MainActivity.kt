package com.vaporstream.android_codetest.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.vaporstream.android_codetest.R
import com.vaporstream.android_codetest.results.ResultsActivity

class MainActivity : AppCompatActivity() {
    private var firstNameEditText: EditText? = null
    private var lastNameEditText: EditText? = null
    private var phoneNumberEditText: EditText? = null
    private var addressOneEditText: EditText? = null
    private var addressTwoEditText: EditText? = null
    private var cityEditText: EditText? = null
    private var spinnerStates: Spinner? = null
    private var zipCodeEditText: EditText? = null
    private var clearButton: Button? = null
    private var submitButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstNameEditText = findViewById(R.id.edit_text_first_name)
        lastNameEditText = findViewById(R.id.edit_text_last_name)
        phoneNumberEditText = findViewById(R.id.edit_text_phone_number)
        addressOneEditText = findViewById(R.id.edit_text_address_one)
        addressTwoEditText = findViewById(R.id.edit_text_address_two)
        cityEditText = findViewById(R.id.edit_text_city)
        spinnerStates = findViewById(R.id.spinner_states)
        zipCodeEditText = findViewById(R.id.edit_text_zipcode)
        clearButton = findViewById(R.id.button_clear)
        submitButton = findViewById(R.id.button_submit)
        val statesAdapter = ArrayAdapter.createFromResource(this, R.array.states_array, android.R.layout.simple_spinner_dropdown_item)
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerStates.setAdapter(statesAdapter)
        clearButton.setOnClickListener(View.OnClickListener { clearForm() })
        submitButton.setOnClickListener(View.OnClickListener { submitForm() })
    }

    private fun clearForm() {
        firstNameEditText!!.setText("")
        lastNameEditText!!.setText("")
        phoneNumberEditText!!.setText("")
        addressOneEditText!!.setText("")
        addressTwoEditText!!.setText("")
        cityEditText!!.setText("")
        spinnerStates!!.setSelection(0)
        zipCodeEditText!!.setText("")
    }

    private fun submitForm() {
        val resultsIntent = Intent(this, ResultsActivity::class.java)
        resultsIntent.putExtra(ResultsActivity.FIRST_NAME, firstNameEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.LAST_NAME, lastNameEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.PHONE_NUMBER, phoneNumberEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.ADDRESS_ONE, addressOneEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.ADDRESS_TWO, addressTwoEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.CITY, cityEditText!!.text.toString())
        resultsIntent.putExtra(ResultsActivity.STATE, spinnerStates!!.selectedItem.toString())
        resultsIntent.putExtra(ResultsActivity.ZIPCODE, zipCodeEditText!!.text.toString())
        startActivity(resultsIntent)
    }
}