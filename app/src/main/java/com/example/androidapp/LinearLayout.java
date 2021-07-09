package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LinearLayout extends AppCompatActivity {

    private TextView linearHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        linearHeader = findViewById(R.id.linearLayoutHeader);
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String statePassedFromMain = extras.getString("destination");
            linearHeader.setText(statePassedFromMain);
        }


    }
}