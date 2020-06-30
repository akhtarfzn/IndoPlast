package com.example.indoplast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UnloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unload);


        Button Unload_button = findViewById(R.id.button8);
        Unload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(UnloadActivity.this, Unload2Activity.class);
                startActivity(myIntent);
                finish();

            }
        });
    }
}
