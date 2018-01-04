package com.alena.beginnertutorials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started");
        Button firstButton = (Button) findViewById(R.id.btnOne);
        Button btnNavToSecond = (Button) findViewById(R.id.btnGo);
        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);
        Button btnToListAdapter = (Button) findViewById(R.id.btnGoToListAdapter);

        int imageResource = getResources().getIdentifier("@drawable/sunsetpic", null, this.getPackageName());
        firstImage.setImageResource(imageResource);
        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked button one");
                toastMessage("Clicked button one.");

                Intent intentN = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intentN);
            }
        });

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);
            }
        });

        btnToListAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentT = new Intent(MainActivity.this, ListAdapterActivity.class);
                startActivity(intentT);
            }
        });

    }
    //prints out a message as a toast
    private void toastMessage(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "toastMessage: clicked button to go to second screen");


    }
}
