package com.example.reforaccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class Activities extends AppCompatActivity {

    Button registroBtn;
    Button compartirBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        Spinner spinnerTipo = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.tipo_actividad, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipo.setAdapter(adapter);

        ImageButton meanMenu = findViewById(R.id.meanMenu);
        ImageButton logoutBtn = findViewById(R.id.imagesingout);
        ImageButton animalBtn = findViewById(R.id.dangeranimal);
        ImageButton tipsBtn = findViewById(R.id.tipsrecom);
        ImageButton fichaBtn = findViewById(R.id.libraryTree);
        ImageButton redesBtn = findViewById(R.id.comunityblog);

        registroBtn = findViewById(R.id.button2);
        compartirBtn = findViewById(R.id.button3);


        meanMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoriesBtn.class);
                startActivity(intent);
            }
        });

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        fichaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.reddearboles.org/ficha-tecnica";
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        animalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Animals.class);
                startActivity(intent);
            }
        });

        tipsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recomendacion.class);
                startActivity(intent);
            }
        });

        redesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://parquesalegres.org/blog_post";
                Uri uri= Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        registroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activities.class);
                startActivity(intent);
            }
        });

        compartirBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://about.instagram.com/es-la/blog/announcements/expanding-sharing-links-in-stories-to-everyone";
                Uri uri= Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}