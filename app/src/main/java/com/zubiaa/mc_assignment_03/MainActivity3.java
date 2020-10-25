package com.zubiaa.mc_assignment_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        TextView textView = findViewById(R.id.resultText);

        if (result.equals("Selected cheboxes are: ")){
            textView.setText("No checkbox waws selected");
        }
        else {
            textView.setText(result);
        }
    }
}