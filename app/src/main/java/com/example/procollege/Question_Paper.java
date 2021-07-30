package com.example.procollege;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Question_Paper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question__paper);

        WebView mywebview_question_paper = (WebView)findViewById(R.id.webview_qpaper);
        mywebview_question_paper.loadUrl("http://centrallibrary.cit.ac.in/QuestionPaper");
    }
}