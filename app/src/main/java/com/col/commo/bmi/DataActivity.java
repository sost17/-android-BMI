package com.col.commo.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by commo on 2017/3/14.
 */

public class DataActivity extends Activity {

    private EditText sg_editText;
    private EditText tz_editText;
    private Button OK_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        sg_editText = (EditText) findViewById(R.id.editText3);
        tz_editText = (EditText) findViewById(R.id.editText4);
        OK_btn = (Button) findViewById(R.id.button2);

        OK_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("height",sg_editText.getText().toString());
                intent.putExtra("weight",tz_editText.getText().toString());
                setResult(10000,intent);
                finish();
            }

        });


    }
}
