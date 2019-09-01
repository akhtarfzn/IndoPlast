package com.example.indoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class QrDetailActivity extends AppCompatActivity  {


    public static TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultTextView = findViewById(R.id.qr_code);

        setContentView(R.layout.activity_qr_detail);

        Intent load_scanner_intent = new Intent(QrDetailActivity.this, ScannerActivity.class);
        startActivity(load_scanner_intent);
        load_scanner_intent = getIntent();
        String code_message = load_scanner_intent.getStringExtra("mould-code");

    }



}