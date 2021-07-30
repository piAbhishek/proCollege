package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        WebView mywebview_notice = (WebView)findViewById(R.id.webview_notice);
        mywebview_notice.loadUrl("https://www.cit.ac.in/pages/notices/all");
    }
}