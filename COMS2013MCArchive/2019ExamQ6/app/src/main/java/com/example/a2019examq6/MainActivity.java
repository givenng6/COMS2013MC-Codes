package com.example.a2019examq6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText lightsNo;
    EditText lightsHours;
    EditText airNo;
    EditText airHours;
    Button print;
    TextView cost1;
    TextView cost2;

    Cost electricityCost = new Cost();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsHours = findViewById(R.id.lightsHours);
        lightsNo = findViewById(R.id.lightNo);
        airHours = findViewById(R.id.airHours);
        airNo = findViewById(R.id.airNo);
        print = findViewById(R.id.results);
        cost1 = findViewById(R.id.cost1);
        cost2 = findViewById(R.id.cost2);



        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int getLightsNo = Integer.parseInt(lightsNo.getText().toString());
                int getLightsHours = Integer.parseInt(lightsHours.getText().toString());
                int getAirNo = Integer.parseInt(airNo.getText().toString());
                int getAirHours = Integer.parseInt(airHours.getText().toString());
                double energyTotalCost = electricityCost.energySaving(getLightsHours, getAirHours, getLightsNo, getAirNo);
                double originalTotalCoat = electricityCost.original(getLightsHours, getAirHours, getLightsNo, getAirNo);
                String text1 = "Cost of energy saving :" + energyTotalCost;
                String text2 = "Cost of original : " + originalTotalCoat;
                cost1.setText(text1);
                cost2.setText(text2);
            }
        });
    }
}