package com.alena.beginnertutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alenagolovina on 11/29/17.
 */

public class SecondScreen extends AppCompatActivity {
    private static final String TAG = "SecondScreen" ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen_layout);

        Log.d(TAG, "onCreate: second screen started");

        TextView mTitleWindow = (TextView) findViewById(R.id.titleWindow);
        TextView mMessageWindow = (TextView) findViewById(R.id.messageWidow);
        Button btnNavToFirst = (Button) findViewById(R.id.btnGoToFirstScreen);

        mTitleWindow.setText("This is a title.");

        StringBuilder stringBuilder = new StringBuilder();

        String someMessage = " This is some message to append. ";

        for (int i=0; i < 100; i++) {
            stringBuilder.append(someMessage);
        }

        mMessageWindow.setText(stringBuilder.toString());

        btnNavToFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnNavToFirst clicked");

                Intent intent = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
