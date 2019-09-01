package com.example.indoplast;


import TotalShotandroid.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;TotalShot;

public class HomeActivity extends AppCompatActivity {

    FirebaseDatabase load_database;
    DatabaseReference loadRef;
   // Button logButton;
//    int totalShots;
//    int shotsLimit;
//    TextView textView7 = findViewById(R.id.textView7);

   // private ArrayList<String> shotsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        load_database = FirebaseDatabase.getInstance();
        loadRef = load_database.getReference("mouldCode");

        // read totalShots and shotsLimit
//        loadRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                try
//        {
////                    String mouldID = dataSnapshot.getKey();
////                    shotsList.add(mouldID);
////                   // String tshots = data.get("totalShots");
////                    //String shotsL = data.get("shotsLimit");
//////                    totalShots = Integer.parseInt(tshots);
//////                    shotsLimit = Integer.parseInt(shotsL);
//                }
//                catch (Exception e){
//                    System.out.println("Error " + e.getMessage());
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });


            Button load_button = findViewById(R.id.button6);
            load_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(HomeActivity.this, LoadActivity.class);
                    startActivity(myIntent);
                    //finish();
                    loadRef.child("Mould Name").setValue("Hi");

                }
            });

            Button Unload_button = findViewById(R.id.button5);
            Unload_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(HomeActivity.this, UnloadActivity.class);
                    startActivity(myIntent);
                    // finish();

                }
            });

            Button Repair_button = findViewById(R.id.button4);
            Repair_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(HomeActivity.this, RepairActivity.class);
                    startActivity(myIntent);
                    //finish();

                }
            });

            Button Qr_button = findViewById(R.id.button3);
            Qr_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(HomeActivity.this, QrDetailActivity.class);
                    startActivity(myIntent);
                    //finish();

                }
            });

//        Button Log_button = findViewById(R.id.button_xyz);
//        Log_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String ss = Integer.toString(totalShots);
//                textView7.setText(ss);
//
//            }
//        });


            //logButton = findViewById(R.id.button_xyz);

            //logButton.setBackgroundColor(getResources().getColor(R.color.red));


        }

//    @Override
//    public void onBackPressed() {
//
//        //Toast.makeText(getApplicationContext(), totalShots + shotsLimit, Toast.LENGTH_SHORT).show();
//        //super.onBackPressed();
//
//    }
    }




