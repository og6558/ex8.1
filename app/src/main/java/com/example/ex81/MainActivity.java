package com.example.ex81;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch swDN;
    RadioButton radio,radio2,radio3,radio4;
    LinearLayout dorelosh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swDN = (Switch) findViewById(R.id.switch1);
        dorelosh = (LinearLayout) findViewById(R.id.dorely);
        radio = (RadioButton) findViewById(R.id.radioButton);
        radio2 = (RadioButton) findViewById(R.id.radioButton2);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);
        radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDN.isChecked()) {
                    dorelosh.setBackgroundColor(Color.BLUE);
                }
            }
        });
        radio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDN.isChecked()) {
                    dorelosh.setBackgroundColor(Color.RED);
                }
            }
        });
        radio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDN.isChecked()) {
                    dorelosh.setBackgroundColor(Color.GREEN);
                }
            }
        });
        radio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDN.isChecked()) {
                    dorelosh.setBackgroundColor(Color.YELLOW);
                }
            }
        });

    }

    public void dorel(View view) {
        if(!swDN.isChecked()){
            if( radio.isChecked()){
                dorelosh.setBackgroundColor(Color.BLUE);

            }
            if( radio2.isChecked()){
                dorelosh.setBackgroundColor(Color.RED);

            }
            if( radio3.isChecked()){
                dorelosh.setBackgroundColor(Color.GREEN);

            }
            if( radio4.isChecked()){
                dorelosh.setBackgroundColor(Color.YELLOW);

            }
        }

    }
}