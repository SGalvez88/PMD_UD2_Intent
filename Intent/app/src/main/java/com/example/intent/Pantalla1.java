package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(this, Pantalla2.class);
        startActivity(intent);
    }
}