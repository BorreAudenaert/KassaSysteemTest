package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OverzichtRestaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overzicht_restaurant);


        Button btnRestaurant = (Button) findViewById(R.id.btnRestaurant);
        btnRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button btnCafe = (Button) findViewById(R.id.btnCafe);
        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentCafe = new Intent(getApplicationContext(), OverzichtCafe.class);
                startActivity(startIntentCafe);
                finish();
            }
        });

        Button btnTerras1 = (Button) findViewById(R.id.btnTerras1);
        btnTerras1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentTerras1 = new Intent(getApplicationContext(), OverzichtTerras1.class);
                startActivity(startIntentTerras1);
                finish();
            }
        });

        Button btnTerras2 = (Button) findViewById(R.id.btnTerras2);
        btnTerras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntentTerras2 = new Intent(getApplicationContext(), OverzichtTerras2.class);
                startActivity(startIntentTerras2);
                finish();
            }
        });

    }
}
