package com.example.myshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String INFO = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(INFO, "onCreate");

        // add tap event
        findViewById(R.id.loginButton).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i(INFO, "onClick");

        EditText etEmail = findViewById(R.id.loginEmail);
        String email = etEmail.getText().toString();
        EditText etPassword = findViewById(R.id.loginPassword);
        String password = etPassword.getText().toString();

        Log.i(INFO, email);
        Log.i(INFO, password);
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

}