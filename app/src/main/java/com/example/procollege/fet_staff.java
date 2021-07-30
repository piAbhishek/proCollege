package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class fet_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fet_staff);

        WebView mywebview_fet_staff = (WebView)findViewById(R.id.webview_fet_people);
        mywebview_fet_staff.loadUrl("https://www.cit.ac.in/departments/fet/academic");
    }
}