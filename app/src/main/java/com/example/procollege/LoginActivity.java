package com.example.procollege;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {
    private EditText userNameEdit, passwordEdit;
    private Button login_Button,create_account_Button;
    private LoggedIn SaveSharedPreference;
    private LoginActivity lastPausedActivity;

    /*SharedPreferences sharedPreferences;
    public static final String filename = "Login";
    public static final String Username = "username";
    public static final String password = "password";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // initializing our edit text  and buttons.
        create_account_Button = (Button)findViewById(R.id.create_account_button);
        userNameEdit = findViewById(R.id.idEditUserName);
        passwordEdit = findViewById(R.id.idEditPassword);
        login_Button = findViewById(R.id.idLogin);
        /*userNameEdit.setText(getIntent().getStringExtra("userName"));
        passwordEdit.setText(getIntent().getStringExtra("password"));*/

        // adding on click listener for our button.
        create_account_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        login_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are getting data from our edit text.
                String userName = userNameEdit.getText().toString();
                String password = passwordEdit.getText().toString();

                // checking if the entered text is empty or not.
                if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(password)) {
                    Toast.makeText(LoginActivity.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
                }

                // calling a method to login our user.
                loginUser(userName, password);

            }
        });
    }

    private void loginUser(String userName, String password) {
        // calling a method to login a user.
        ParseUser.logInInBackground(userName, password, (parseUser, e) -> {
            // after login checking if the user is null or not.
            if (parseUser != null) {
                // if the user is not null then we will display a toast message
                // with user login and passing that user to new activity.
                Toast.makeText(this, "Login Successful ", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(LoginActivity.this, EnterActivity.class);
                i.putExtra("userName", userName);
                startActivity(i);
            } else {
                // display an toast message when user logout of the app.
                ParseUser.logOut();
                Toast.makeText(LoginActivity.this, "Fail to Logged in", Toast.LENGTH_LONG).show();
            }
        });

        
        /*if(SaveSharedPreference.getUserName(LoginActivity.this).length()==0){
            Intent i = new Intent(LoginActivity.this, EnterActivity.class);
            i.putExtra("userName", userName);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(LoginActivity.this,EnterActivity.class);
        }*/

    }
    /*@Override
    protected void onPause(){
        super.onPause();
        lastPausedActivity = this;
    }
    @Override
    protected void onResume(){
        super.onResume();
        if(this == lastPausedActivity) {
            lastPausedActivity = null;
            Intent intent = new Intent(this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
    }*/
}