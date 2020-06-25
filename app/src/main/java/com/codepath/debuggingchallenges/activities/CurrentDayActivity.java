package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;
    public static final String TAG = "CurrentDayActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "1");
        setContentView(R.layout.activity_current_day);
        Log.d(TAG, "2");
        tvDay = (TextView) findViewById(R.id.tvDay);
        Log.d(TAG, "3");
        Log.d(TAG, "Result of getDayOfMonth: " + getDayOfMonth());
        tvDay.setText("" + getDayOfMonth());
    }

    private int getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_MONTH);
    }
}
