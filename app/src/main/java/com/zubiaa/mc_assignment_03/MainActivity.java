package com.zubiaa.mc_assignment_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup g1, g2;
    RadioButton rb;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        g1 = findViewById(R.id.rg1);
        g2 = findViewById(R.id.rg2);
        result = findViewById(R.id.result);
    }


    public void ShowText(View view) {
        String str = "Selected radio button are ";

        int i1 = g1.getCheckedRadioButtonId();
        int i2 = g2.getCheckedRadioButtonId();

        rb = findViewById(i1);
        str = str + rb.getText() + " and ";

        rb = findViewById(i2);
        str = str + rb.getText();

        result.setText(str);
    }
}