package com.android.smartcampus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityCar extends AppCompatActivity {

    Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        map = (Button) findViewById(R.id.button);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(ActivityCar.this, MapsActivity.class);
                startActivity(i2);

                Toast.makeText(ActivityCar.this, "Validated!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
