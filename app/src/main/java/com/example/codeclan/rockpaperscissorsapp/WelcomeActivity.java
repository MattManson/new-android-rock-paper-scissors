package com.example.codeclan.rockpaperscissorsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void onPlayButtonClicked(View button) {
        Log.d(getClass().toString(), "On Play button was called");

        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);
    }
}
