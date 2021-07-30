package com.example.procollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Departments extends AppCompatActivity {

    Button coreEngineering_button, alliedEngineering_button, design_button, basicSciences_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        coreEngineering_button = (Button)findViewById(R.id.core_engineering);
        alliedEngineering_button = (Button)findViewById(R.id.allied_engineering);
        design_button = (Button)findViewById(R.id.design);
        basicSciences_button = (Button)findViewById(R.id.basic_sciences);

        coreEngineering_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Departments.this, CoreEngineering.class);
                startActivity(intent);
            }
        });
        alliedEngineering_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Departments.this, AlliedEngineering.class);
                startActivity(intent);
            }
        });
        design_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Departments.this, Design.class);
                startActivity(intent);
            }
        });
        basicSciences_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Departments.this, BasicSciences.class);
                startActivity(intent);
            }
        });
    }
}