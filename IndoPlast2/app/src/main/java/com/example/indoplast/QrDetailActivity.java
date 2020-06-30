package com.example.indoplast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class QrDetailActivity extends AppCompatActivity {


    public static TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     resultTextView = (TextView)findViewById(R.id.qr_code);

        setContentView(R.layout.activity_qr_detail);
    }



}