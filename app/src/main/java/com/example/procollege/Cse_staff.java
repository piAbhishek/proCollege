package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Cse_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_staff);

        WebView mywebview_cse_staff = (WebView)findViewById(R.id.webview_cse_people);
        mywebview_cse_staff.loadUrl("https://www.cit.ac.in/departments/cse/academic");
    }
}