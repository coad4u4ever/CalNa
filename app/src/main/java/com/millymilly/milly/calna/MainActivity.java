package com.millymilly.milly.calna;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Chakrit Tansakul on 09-Jan-18.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputNum;
    private Button btnBasic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBasic = (Button) findViewById(R.id.btnBasic);
        inputNum = (EditText) findViewById(R.id.inputnum);
        //
        btnBasic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), RealCalculator.class);
        intent.putExtra("InputNumber",inputNum.getText());
        startActivity(intent);
    }
}
