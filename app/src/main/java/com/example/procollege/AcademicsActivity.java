package com.example.procollege;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AcademicsActivity extends AppCompatActivity {

    Button syllabus_Button, notice_Button, question_paper_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        syllabus_Button = (Button)findViewById(R.id.syllabus);
        notice_Button = (Button)findViewById(R.id.notice);
        question_paper_Button = (Button)findViewById(R.id.question_paper);

        syllabus_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicsActivity.this, Syllabus.class) ;
                startActivity(intent);
            }
        });
        notice_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicsActivity.this, notice.class);
                startActivity(intent);
            }
        });
        question_paper_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcademicsActivity.this, Question_Paper.class);
                startActivity(intent  );
            }
        });
    }
}