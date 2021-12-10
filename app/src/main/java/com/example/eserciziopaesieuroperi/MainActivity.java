package com.example.eserciziopaesieuroperi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);                //QUANDO PREMI IL BOTTONE SI ATTIVA IL METODO E ATTIVA L'ALTRA ACTIVITY
            }
        });

    }
    public void play(View r){   //NUOVA ACTIVITY
        Intent i=new Intent(getApplicationContext(), secact.class);
        startActivity(i);
    }
}