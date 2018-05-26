package com.col.commo.bmi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.view.KeyEvent;
import android.widget.TextView;

/**
 * Created by commo on 2017/3/14.
 */

public class BMIActivity extends Activity {

    private TextView sg_textView;
    private TextView tz_textView;
    private TextView BMI_textView;


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        sg_textView = (TextView) findViewById(R.id.textView5);
        tz_textView = (TextView) findViewById(R.id.textView6);
        BMI_textView = (TextView) findViewById(R.id.textView10);

        Intent intent = getIntent();

        Double height = intent.getDoubleExtra("height",0.0);
        Double weight = intent.getDoubleExtra("weight",0.0);
        Double BMI = intent.getDoubleExtra("BMI",0.0);

        String BMIString = new DecimalFormat("#.00").format(BMI);

        sg_textView.setText(""+height);
        tz_textView.setText(""+weight);
        BMI_textView.setText(BMIString);

    }


}
