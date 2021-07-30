package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Timetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        WebView mywebview_timetable = (WebView)findViewById(R.id.webview_timetable);
        mywebview_timetable.loadUrl("https://www.cit.ac.in/uploads/1598639604.pdf");
    }
}