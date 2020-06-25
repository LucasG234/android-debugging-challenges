package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.codepath.debuggingchallenges.R;

public class ToolbarActivity extends AppCompatActivity {

    public static final String TAG = "ToolbarActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        Log.d(TAG, "0");
        // Find the toolbar view inside the activity layout
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Log.d(TAG, "1");
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        Log.d(TAG, "2");
        TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvDescription.setText(R.string.hello);

        getSupportActionBar().setTitle(R.string.hello);
    }
}
