package com.example.procollege;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.parse.Parse;

public class proCollege extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // initializing our Parse application with
        // our application id, client key and server url
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                // at last we are building our
                // parse with the above credentials
                .build());


    }

}

