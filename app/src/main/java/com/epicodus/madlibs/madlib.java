package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class madlib extends AppCompatActivity {
    private TextView mMadlib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlib);
        Intent intent = getIntent();
        String nounOne = intent.getStringExtra("nounOne");
        String nounTwo = intent.getStringExtra("nounTwo");
        String verbOne = intent.getStringExtra("verbOne");
        String verbTwo = intent.getStringExtra("verbTwo");
        String location = intent.getStringExtra("location");
        mMadlib = (TextView) findViewById(R.id.locationTextView);
        mMadlib.setText("The " + nounOne + " went to the " + location + " with " + nounTwo + " and " + verbOne + " before " + verbTwo + " and they lived happily ever after.");
    }
}
