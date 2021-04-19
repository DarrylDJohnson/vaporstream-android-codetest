package com.vaporstream.android_codetest.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.vaporstream.android_codetest.R;
import com.vaporstream.android_codetest.results.ResultsActivity;

import static com.vaporstream.android_codetest.results.ResultsActivity.ADDRESS_ONE;
import static com.vaporstream.android_codetest.results.ResultsActivity.ADDRESS_TWO;
import static com.vaporstream.android_codetest.results.ResultsActivity.CITY;
import static com.vaporstream.android_codetest.results.ResultsActivity.FIRST_NAME;
import static com.vaporstream.android_codetest.results.ResultsActivity.LAST_NAME;
import static com.vaporstream.android_codetest.results.ResultsActivity.PHONE_NUMBER;
import static com.vaporstream.android_codetest.results.ResultsActivity.STATE;
import static com.vaporstream.android_codetest.results.ResultsActivity.ZIPCODE;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText phoneNumberEditText;
    private EditText addressOneEditText;
    private EditText addressTwoEditText;
    private EditText cityEditText;
    private Spinner spinnerStates;
    private EditText zipCodeEditText;
    private Button clearButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        firstNameEditText = this.findViewById(R.id.edit_text_first_name);
        lastNameEditText = this.findViewById(R.id.edit_text_last_name);
        phoneNumberEditText = this.findViewById(R.id.edit_text_phone_number);
        addressOneEditText = this.findViewById(R.id.edit_text_address_one);
        addressTwoEditText = this.findViewById(R.id.edit_text_address_two);
        cityEditText = this.findViewById(R.id.edit_text_city);
        spinnerStates = findViewById(R.id.spinner_states);
        zipCodeEditText = this.findViewById(R.id.edit_text_zipcode);
        clearButton = this.findViewById(R.id.button_clear);
        submitButton = this.findViewById(R.id.button_submit);

        ArrayAdapter<CharSequence> statesAdapter = ArrayAdapter.createFromResource(this, R.array.states_array, android.R.layout.simple_spinner_dropdown_item);
        statesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerStates.setAdapter(statesAdapter);

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearForm();
            }
        });
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitForm();
            }
        });
    }

    private void clearForm() {
        firstNameEditText.setText("");
        lastNameEditText.setText("");
        phoneNumberEditText.setText("");
        addressOneEditText.setText("");
        addressTwoEditText.setText("");
        cityEditText.setText("");
        spinnerStates.setSelection(0);
        zipCodeEditText.setText("");
    }

    private void submitForm() {
        Intent resultsIntent = new Intent(this, ResultsActivity.class);
        resultsIntent.putExtra(FIRST_NAME, firstNameEditText.getText().toString());
        resultsIntent.putExtra(LAST_NAME, lastNameEditText.getText().toString());
        resultsIntent.putExtra(PHONE_NUMBER, phoneNumberEditText.getText().toString());
        resultsIntent.putExtra(ADDRESS_ONE, addressOneEditText.getText().toString());
        resultsIntent.putExtra(ADDRESS_TWO, addressTwoEditText.getText().toString());
        resultsIntent.putExtra(CITY, cityEditText.getText().toString());
        resultsIntent.putExtra(STATE, spinnerStates.getSelectedItem().toString());
        resultsIntent.putExtra(ZIPCODE, zipCodeEditText.getText().toString());
        startActivity(resultsIntent);
    }

}