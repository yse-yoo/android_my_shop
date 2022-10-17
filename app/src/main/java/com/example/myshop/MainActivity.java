package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String INFO = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(INFO, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(INFO, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(INFO, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(INFO, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(INFO, "onStop");
    }

    @Override
    public void onClick(View view) {
        
    }
}