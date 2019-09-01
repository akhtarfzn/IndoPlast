package com.example.indoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Unload2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unload2);

        Button Unload_button = findViewById(R.id.button_unload_submit);
        Unload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Unload2Activity.this, "Data Uploaded", Toast.LENGTH_SHORT).show();
                Intent myIntent= new Intent(Unload2Activity.this, HomeActivity.class);
                startActivity(myIntent);
                finish();
            }
        });
    }
}
