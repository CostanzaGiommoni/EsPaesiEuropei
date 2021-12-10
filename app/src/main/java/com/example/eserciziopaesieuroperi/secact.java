package com.example.eserciziopaesieuroperi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;

public class secact extends AppCompatActivity {
ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secact);
        lista= (ListView) findViewById(R.id.lista);
        String[] peuropei=new String[]{"Francia","Spagna","Itala","Norvegia","Russia","Irlanda"};
        ArrayAdapter<String> aradd=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peuropei);    //Serve per adattare un array(comprimerlo) e metterlo nella listview
        lista.setAdapter(aradd);
    }
}