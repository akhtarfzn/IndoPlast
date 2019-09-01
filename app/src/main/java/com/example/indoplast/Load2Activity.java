package com.example.indoplast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Load2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load2);
        Button Unload_button = findViewById(R.id.button_load_submit);
        Unload_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Load2Activity.this, "Data Uploaded", Toast.LENGTH_SHORT).show();
                Intent myIntent= new Intent(Load2Activity.this, HomeActivity.class);
                startActivity(myIntent);
                finish();

            }
        });

    }
}
