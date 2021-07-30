package com.example.procollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PortalActivity extends AppCompatActivity {

    Button events_Button, time_table_Button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portal);
        events_Button =  (Button)findViewById(R.id.events);
        time_table_Button = (Button)findViewById(R.id.timetable);


        events_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PortalActivity.this, Events.class);
                startActivity(intent);
            }
        });
        time_table_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PortalActivity.this, Timetable.class);
            }
        });
    }
}