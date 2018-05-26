package com.col.commo.bmi;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText sg_editText;
    private EditText tz_editText;
    private Button BMI_button;
    private Button Data_button;
    private Button tuicu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sg_editText = (EditText) findViewById(R.id.editText);
        tz_editText = (EditText) findViewById(R.id.editText2);

        BMI_button = (Button) findViewById(R.id.button);
        Data_button = (Button) findViewById(R.id.button3);
        tuicu = (Button) findViewById(R.id.button6);

        Data_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,DataActivity.class);
                startActivityForResult(intent,10000);
            }
        });

        BMI_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String sg_string = sg_editText.getText().toString();
                String tz_string = tz_editText.getText().toString();

                Double sg = Double.parseDouble(sg_string);
                Double tz = Double.parseDouble(tz_string);
                Double BMI = 0.0;
                BMI = 10000*tz/(sg*sg);

                Intent intent = new Intent();
                intent.setClass(MainActivity.this,BMIActivity.class);

                intent.putExtra("height",sg);
                intent.putExtra("weight",tz);
                intent.putExtra("BMI",BMI);
                startActivity(intent);
            }
        });

        tuicu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = getLayoutInflater().inflate(R.layout.login,null);
                AlertDialog bb = new AlertDialog.Builder(MainActivity.this).setTitle("12312")
                        .setView(view).show();
        });




    }


}
