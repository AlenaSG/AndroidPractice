package com.alena.beginnertutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class ClickedNameActivity extends AppCompatActivity {

    private static final String TAG = "ClickedNameActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clicked_name);
        Log.d(TAG, "onCreate: started");
        TextView incomingData = (TextView) findViewById(R.id.etIncomingData);

        Intent incomingIntent = getIntent();
        String incomingName = incomingIntent.getStringExtra("name");
        Log.d(TAG, "onCreate: Found incoming name: " + incomingName);

        incomingData.setText(incomingName);
    }
}