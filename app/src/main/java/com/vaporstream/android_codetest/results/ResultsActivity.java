package com.vaporstream.android_codetest.results;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.vaporstream.android_codetest.R;

public class ResultsActivity extends AppCompatActivity {

    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String PHONE_NUMBER = "phone_number";
    public static final String ADDRESS_ONE = "address_one";
    public static final String ADDRESS_TWO = "address_two";
    public static final String CITY = "city";
    public static final String STATE = "state";
    public static final String ZIPCODE = "zipcode";

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String addressOne;
    private String addressTwo;
    private String city;
    private String state;
    private String zipCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_results);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            firstName = extras.getString(FIRST_NAME);
            lastName = extras.getString(LAST_NAME);
            phoneNumber = extras.getString(PHONE_NUMBER);
            addressOne = extras.getString(ADDRESS_ONE);
            addressTwo = extras.getString(ADDRESS_TWO);
            city = extras.getString(CITY);
            state = extras.getString(STATE);
            zipCode = extras.getString(ZIPCODE);
        }

        TextView firstNameTextView = findViewById(R.id.text_view_first_name);
        TextView lastNameTextView = findViewById(R.id.text_view_last_name);
        TextView phoneNumberTextView = findViewById(R.id.text_view_phone_number);
        TextView addressOneTextView = findViewById(R.id.text_view_address_one);
        TextView addressTwoTextView = findViewById(R.id.text_view_address_two);
        TextView cityTextView = findViewById(R.id.text_view_city);
        TextView stateTextView = findViewById(R.id.text_view_state);
        TextView zipCodeTextView = findViewById(R.id.text_view_zip_code);

        firstNameTextView.setText(firstName);
        lastNameTextView.setText(lastName);
        phoneNumberTextView.setText(phoneNumber);
        addressOneTextView.setText(addressOne);
        addressTwoTextView.setText(addressTwo);
        cityTextView.setText(city);
        stateTextView.setText(state);
        zipCodeTextView.setText(zipCode);
    }

}