package com.example.procollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutActivity extends AppCompatActivity {

    Button cit_button , department_button, admission_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        cit_button = (Button)findViewById(R.id.cit_id);
        department_button = (Button)findViewById(R.id.department_id);
        admission_button = (Button)findViewById(R.id.admission_id);

        cit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, CIT.class);
                startActivity(intent);
            }
        });

        department_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, Departments.class);
                startActivity(intent);
            }
        });
        admission_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, Admission.class);
                startActivity(intent);
            }
        });
    }
}