package com.example.indoplast;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_home);

        Button load_button = findViewById(R.id.button6);
        load_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(HomeActivity.this, LoadActivity.class);
                startActivity(myIntent);
                finish();

            }
        });

        Button Unload_button = findViewById(R.id.button5);
        Unload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(HomeActivity.this, UnloadActivity.class);
                startActivity(myIntent);
                finish();

            }
        });

        Button Repair_button = findViewById(R.id.button4);
        Repair_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(HomeActivity.this, RepairActivity.class);
                startActivity(myIntent);
                finish();

            }
        });


    }

//    public void unload_button(View view) {
//        Intent myIntent= new Intent(HomeActivity.this, UnloadActivity.class);
//        startActivity(myIntent);
//        finish();
//    }
}
