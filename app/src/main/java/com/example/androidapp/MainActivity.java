package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button linearLayout;
    private Button relativeLayout;
    private Button frameLayout;
    private Button tableLayout;
    private Button cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (Button) findViewById(R.id.navToLinearLayout);
        relativeLayout = (Button) findViewById(R.id.navToRelativeLayout);
        frameLayout = (Button) findViewById(R.id.navToFrameLayout);
        tableLayout = (Button) findViewById(R.id.navToTableLayout);
        cardView = (Button) findViewById(R.id.navToCardView);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLinear = new Intent(MainActivity.this, LinearLayout.class);
                toLinear.putExtra("destination", "Linear Layout");
                startActivity(toLinear);
            }
        });

        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRelative = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(toRelative);
            }
        });

        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFrame = new Intent(MainActivity.this, FrameLayout.class);
                startActivity(toFrame);
            }
        });

        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTable = new Intent(MainActivity.this, TableLayout.class);
                startActivity(toTable);
            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCardView = new Intent(MainActivity.this, CardView.class);
                startActivity(toCardView);
            }
        });
    }
}