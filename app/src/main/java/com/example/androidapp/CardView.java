package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class CardView extends AppCompatActivity {

    private TextView cardTitle;
    private Spinner nameSpinner;
    private ConstraintLayout parent;
    private ImageView cardImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        cardTitle = findViewById(R.id.cardViewHeader);
        nameSpinner = findViewById(R.id.spinnerNames);
        parent = findViewById(R.id.cardViewParent);
        cardImage = findViewById(R.id.cardImage);

        nameSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar.make(parent, nameSpinner.getSelectedItem().toString() + " is selected", Snackbar.LENGTH_LONG).show();
                cardTitle.setText(nameSpinner.getSelectedItem().toString());
                if(nameSpinner.getSelectedItemPosition() == 1){
                    cardImage.setImageResource(R.drawable.ic_launcher_background);
                }else{
                    cardImage.setImageResource(R.mipmap.bulb);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Snackbar.make(parent, nameSpinner.getSelectedItem().toString(), Snackbar.LENGTH_LONG).show();
            }
        });
    }
}