package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ie_staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ie_staff);

        WebView mywebview_ie_staff = (WebView)findViewById(R.id.webview_ie_people);
        mywebview_ie_staff.loadUrl("https://www.cit.ac.in/departments/ie/academic");
    }
}