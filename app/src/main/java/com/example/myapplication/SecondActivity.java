package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnCerrar;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "Ejecuto onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados", "Ejecuto onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "Ejecuto onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "Ejecuto onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "Ejecuto onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnCerrar= findViewById(R.id.btnCerrarSecond);
        btnCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}