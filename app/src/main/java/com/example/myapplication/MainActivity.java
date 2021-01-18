package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Click";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (MyButton button : MyButton.values()) {
            findViewById(button.getId()).setOnClickListener((View l) -> {
                Log.i(TAG, String.format(
                        getString(R.string.logMessage),
                        getString(button.getTextRes())
                ));
            });
        }
    }
}