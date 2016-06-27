package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private EditText mNounOne;
    private EditText mNounTwo;
    private EditText mVerbOne;
    private EditText mVerbTwo;
    private EditText mLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNounOne = (EditText) findViewById(R.id.nounOne);
        mNounTwo = (EditText) findViewById(R.id.nounTwo);
        mVerbOne = (EditText) findViewById(R.id.verbOne);
        mVerbTwo = (EditText) findViewById(R.id.verbTwo);
        mLocation = (EditText) findViewById(R.id.location);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nounOne = mNounOne.getText().toString();
                String nounTwo = mNounTwo.getText().toString();
                String verbOne = mVerbOne.getText().toString();
                String verbTwo = mVerbTwo.getText().toString();
                String location = mLocation.getText().toString();
                Intent intent = new Intent(MainActivity.this, madlib.class);
                intent.putExtra("nounOne", nounOne);
                intent.putExtra("nounTwo", nounTwo);
                intent.putExtra("verbOne", verbOne);
                intent.putExtra("verbTwo", verbTwo);
                intent.putExtra("location", location);
                startActivity(intent);
            }
        });

    }
}
