package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tafelOverzicht extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tafel_overzicht);

        Button btnTerug = (Button) findViewById(R.id.btnTerug);
        btnTerug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishActivity(1);
                Tafel tafel1 = new Tafel((this.getClass().getModifiers()));

                finish();
            }
        });
    }
}
