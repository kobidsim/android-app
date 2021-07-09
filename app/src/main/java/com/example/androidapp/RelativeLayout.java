package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RelativeLayout extends AppCompatActivity {

    private View parent;
    private Button submit;
    private TextView header;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);

        header = (TextView) findViewById(R.id.frontPageHeader);
        input = (EditText) findViewById(R.id.nameInput);
        submit = (Button) findViewById(R.id.submitButton1);
        parent = (View) findViewById(R.id.relativeLayout);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable userInput = input.getText();
                header.setText("Welcome back, "+userInput.toString());
                //Toast.makeText(MainActivity.this, "You input: "+userInput, Toast.LENGTH_SHORT).show();
                Snackbar.make(parent, "Your Input: "+userInput, Snackbar.LENGTH_LONG)
                        .setAction("Again", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(RelativeLayout.this, "You input: "+userInput, Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setActionTextColor(Color.RED)
                        .setTextColor(Color.YELLOW).show();
            }
        });
    }
}