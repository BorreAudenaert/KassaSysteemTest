package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button) findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open 2e scherm

                Intent startIntent = new Intent(getApplicationContext(), OverzichtRestaurant.class);
                startActivity(startIntent);


                //setContentView(R.layout.activity_overzicht_restaurant);
            }
        });
        Button btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //App afsluitenv
                finish();
                System.exit(1);
            }
        });

    }
}
