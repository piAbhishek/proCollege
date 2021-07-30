package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class it_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it_staff);

        WebView mywebview_it_staff = (WebView)findViewById(R.id.webview_it_people);
        mywebview_it_staff.loadUrl("https://www.cit.ac.in/departments/it/academic");
    }
}