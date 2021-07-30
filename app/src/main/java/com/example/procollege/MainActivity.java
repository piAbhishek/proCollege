package com.example.procollege;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class MainActivity extends AppCompatActivity {

    // Button first_button;
    private EditText userNameEdit, passwordEdit, userEmailEdit;
    private Button register_Button, existingUser_Button;
    //String alreadyLoggedIn = "yes";


        /*public void onResume() {
            super.onResume();
            SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.app_name), Context.MODE_PRIVATE);
            if (!sharedPreferences.getBoolean(alreadyLoggedIn, false)) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean(alreadyLoggedIn, Boolean.TRUE);
                editor.apply();
            } else {
                moveToEnterActivity();
            }
        }

        public void moveToEnterActivity() {
            Intent intent = new Intent(this, EnterActivity.class);
            startActivity(intent);
        }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initializing our edit text  and buttons.
        userNameEdit = findViewById(R.id.idEditUserName);
        passwordEdit = findViewById(R.id.idEditPassword);
        userEmailEdit = findViewById(R.id.idEditEmail);
        register_Button = findViewById(R.id.idRegister);
        existingUser_Button = findViewById(R.id.existingUser);

        existingUser_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // adding on click listener for our button
        register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are getting data from our edit text.
                String userName = userNameEdit.getText().toString();
                String password = passwordEdit.getText().toString();
                String email = userEmailEdit.getText().toString();

                // checking if the entered text is empty or not.
                if (TextUtils.isEmpty(userName) && TextUtils.isEmpty(password) && TextUtils.isEmpty(email)) {
                    Toast.makeText(MainActivity.this, "Please enter user name and password", Toast.LENGTH_SHORT).show();
                }

                // calling a method to register a user.
                registerUser(userName, password, email);
            }
        });
    }

    private void registerUser(String userName, String password, String email) {

        // on below line we are creating
        // a new user using parse user.

        ParseUser user = new ParseUser();


        // Set the user's username, user email and password,
        // which can be obtained from edit text
        user.setUsername(userName);
        user.setEmail(email);
        user.setPassword(password);

        // calling a method to register the user.
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                // on user registration checking
                // if the error is null or not.
                if (e == null) {
                    // if the error is null we are displaying a toast message and
                    // redirecting our user to login activity and passing the user name.
                    Toast.makeText(MainActivity.this, "User Registered successfully \n Please verify your email", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, LoginActivity.class);
                    i.putExtra("username", userName);
                    i.putExtra("password", password);
                    startActivity(i);
                } else {
                    // if we get any error then we are logging out
                    // our user and displaying an error message
                    ParseUser.logOut();
                    Toast.makeText(MainActivity.this, "Fail to Register User..", Toast.LENGTH_SHORT).show();
                }
            }
        });
        /*if(SaveSharedPreference.getUserName(MainActivity.this).length()==0){
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            i.putExtra("userName", userName);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(MainActivity.this,LoginActivity.class);
        }*/

    }
}