package com.android.smartcampus;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class category extends AppCompatActivity {

    CardView heal, smcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        heal = (CardView) findViewById(R.id.hea);
        smcar = (CardView) findViewById(R.id.car);


        heal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(category.this, ActivityHealth.class);
                startActivity(i1);
            }
        });


        smcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(category.this, ActivityCar.class);
                startActivity(i2);
            }
        });
    }
}
