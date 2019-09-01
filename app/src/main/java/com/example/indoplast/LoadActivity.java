package com.example.indoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoadActivity extends AppCompatActivity {

    TextView load_mould_code_textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_load);


        load_mould_code_textView = findViewById(R.id.load_mould_code);

        Intent load_scanner_intent = new Intent(LoadActivity.this, ScannerActivity.class);
        startActivity(load_scanner_intent);

        load_scanner_intent = getIntent();
        String code_message = load_scanner_intent.getStringExtra("mould-code");
        //load_mould_code_textView.setText(code_message);

        Button loadNext_button = findViewById(R.id.buttonLoadNext);
        loadNext_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent= new Intent(LoadActivity.this, Load2Activity.class);
                startActivity(myIntent);
                //finish();
            }
        });


    }
}
