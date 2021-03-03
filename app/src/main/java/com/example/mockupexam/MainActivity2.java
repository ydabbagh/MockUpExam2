package com.example.mockupexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    String firstName;
    String title;
    int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn1 = (Button) findViewById(R.id.button3);
        Button btn3 = (Button) findViewById(R.id.button4);
        Button submit =(Button) findViewById(R.id.submitBttn);
        EditText name =(EditText) findViewById(R.id.inputName);
        EditText year =(EditText) findViewById(R.id.inputYear);
        final RadioButton female = (RadioButton) findViewById(R.id.radioButtonFEMALE);
        final RadioButton male = (RadioButton) findViewById(R.id.radioButtonMALE);
        TextView output = (TextView) findViewById(R.id.output);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstName = (name.getText().toString());
                age = 2021 - (Integer.parseInt(year.getText().toString()));
                if (male.isChecked()) {
                    title="Mr. ";
                }
                else if (female.isChecked()) {
                    title="Ms. ";
                }
                else{
                    title="N/A ";
                }
                output.setText("Hi " + title + " " + firstName + " you are " + age + " years old");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

    }
}