package com.example.procollege;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class EnterActivity extends AppCompatActivity {

    private TextView userNameTV;
    Button about_button, portal_button, academic_button;
    Button logout_button;
    private IntentFilter Log_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        about_button = (Button) findViewById(R.id.about_id);
        portal_button = (Button) findViewById(R.id.portal_id);
        academic_button = (Button) findViewById(R.id.academic_id);
        logout_button = (Button) findViewById(R.id.logout);

        // initializing our variables
        userNameTV = findViewById(R.id.userName);

        // getting data from intent.
        String name = getIntent().getStringExtra("username");

        // setting data to our text view.
        userNameTV.setText(name);

        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
        portal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterActivity.this, PortalActivity.class);
                startActivity(intent);
            }
        });
        academic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterActivity.this, AcademicsActivity.class);
                startActivity(intent);
            }
        });
        Intent intent1 = getIntent();
        String string = intent1.getStringExtra("message");
        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(EnterActivity.this);
                builder.setTitle("Confirmation PopUp!");
                builder.setMessage("You sure, that you want to logout?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent2 = new Intent(EnterActivity.this, LoginActivity.class);
                                intent2.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                intent2.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent2);
                                finish();
                                /*final String Log_out = "event_logout";
                                Intent intent = new Intent(Log_out);
                                LocalBroadcastManager.getInstance(EnterActivity.this).sendBroadcast(intent);*/
                            }
                        });
                builder.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    /*public void onCreate1(Bundle savedInstanceState) {
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, new IntentFilter(Log_out));
    }

    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            finish();
        }};*/
}