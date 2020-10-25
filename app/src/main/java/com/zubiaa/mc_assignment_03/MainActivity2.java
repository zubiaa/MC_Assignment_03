package com.zubiaa.mc_assignment_03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity2 extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
    }


    public void ShowResult(View view) {
        String result = "Selected cheboxes are: ";

        if(cb1.isChecked()){
            result = result + cb1.getText() + ", ";
        }

        if(cb2.isChecked()){
            result = result + cb2.getText() + ", ";
        }

        if(cb3.isChecked()){
            result = result + cb3.getText() + ", ";
        }

        if(cb4.isChecked()){
            result = result + cb4.getText();
        }

        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}