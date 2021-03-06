package com.example.procollege;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class LoggedIn {
    private static final String PREF_USER_NAME ="";

    static SharedPreferences getSharedPreferences(Context ctx){
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }
    public static void serUserName(Context ctx, String userName)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ctx).edit();
        editor.putString(PREF_USER_NAME, userName);
        editor.commit();
    }
    public static String getUserName(Context ctx)
    {
        return getSharedPreferences(ctx).getString(PREF_USER_NAME , "");
    }
}
