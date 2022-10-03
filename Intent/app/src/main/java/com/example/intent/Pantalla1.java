package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class Pantalla1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent();


        startActivity(intent);

    }

    /* accion que abre el email y le pone un texto por defecto
    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, "hola mail");
        intent.setType("text/plain");
        startActivity(intent);
    }
    */
    /*
    @Override para abrir el dial del telefono
    protected void onRestart() {
        super.onRestart();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel: +34646186174"));
        startActivity(intent);
    }*/

    /*
    @Override
    protected void onRestart() {
        super.onRestart();
        //Intent intent = new Intent(this, Pantalla2.class);//contexto y hacia donde voy
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }
    */

    /*
    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.google.com"));
        startActivity(intent);
    }*/
}