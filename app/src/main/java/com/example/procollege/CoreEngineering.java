package com.example.procollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CoreEngineering extends AppCompatActivity {
    Button cse_people, it_people, ece_people, civil_people, ie_people, fet_people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_engineering);
        cse_people = (Button)findViewById(R.id.cse_people);
        it_people = (Button)findViewById(R.id.it_people);
        ece_people = (Button)findViewById(R.id.ece_people);
        civil_people = (Button)findViewById(R.id.civil_people);
        ie_people = (Button)findViewById(R.id.ie_people);
        fet_people = (Button)findViewById(R.id.fet_people);

        cse_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,Cse_staff.class);
                startActivity(intent);
            }
        });
        it_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,it_staff.class);
                startActivity(intent);
            }
        });
        ece_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,ece_staff.class);
                startActivity(intent);
            }
        });
        civil_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,civil_staff.class);
                startActivity(intent);
            }
        });
        ie_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,ie_staff.class);
                startActivity(intent);
            }
        });
        fet_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoreEngineering.this,fet_staff.class);
                startActivity(intent);
            }
        });
    }
}