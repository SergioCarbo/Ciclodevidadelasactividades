package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Paso 1. variables de la vista
    private Button btnAbrir;

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
        setContentView(R.layout.activity_main);
        Log.e("Estados", "Ejecuto onCreat");

        btnAbrir = findViewById(R.id.btnAbrirMain);
        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* Vehiculo conductor > Intent (el objeto encargado de avisar a Android:
                        1. Qquien quiere abrir una nueva activity
                        2. Cual queire abrir)
                 */

                /*2Tipos
                  implicitos > abren cosas del sitema
                  explicitos > cosas hechas por mi*/

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}