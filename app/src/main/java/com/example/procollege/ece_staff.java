package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ece_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_staff);

        WebView mywebview_ece_staff = (WebView)findViewById(R.id.webview_ece_people);
        mywebview_ece_staff.loadUrl("https://www.cit.ac.in/departments/ece/academic");
    }
}