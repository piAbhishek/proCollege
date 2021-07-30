package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class civil_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_staff);

        WebView mywebview_civil_staff = (WebView)findViewById(R.id.webview_civil_people);
        mywebview_civil_staff.loadUrl("https://www.cit.ac.in/departments/ce/academic");
    }
}