package com.example.besafeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
    Button  logout, travell, sensortest,ridex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        logout = findViewById(R.id.Logout);
        travell = findViewById(R.id.travel);
        sensortest = findViewById(R.id.sensor);
        ridex = findViewById(R.id.RX);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lagout = new Intent(mainmenu.this,MA.class);
                startActivity(lagout);
            }
        });


        travell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent travel = new Intent(mainmenu.this,MapsActivity.class);
                startActivity(travel);
            }
        });

        sensortest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sensor = new Intent(mainmenu.this,MainActivity2.class);
                startActivity(sensor);
            }
        });

        ridex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent help = new Intent(mainmenu.this,MainActivity.class);
                startActivity(help);
            }
        });




    }
}
