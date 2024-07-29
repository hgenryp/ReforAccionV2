package com.example.reforaccion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Species extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_species);

        ImageButton meanMenu = findViewById(R.id.meanMenu);
        ImageButton animalBtn = findViewById(R.id.dangeranimal);
        ImageButton tipsBtn = findViewById(R.id.tipsrecom);
        ImageButton exitButton = findViewById(R.id.imagesingout);
        ImageButton fichaBtn = findViewById(R.id.libraryTree);

        meanMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoriesBtn.class);
                startActivity(intent);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
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

        //ImageButton fichaBtn = findViewById(R.id.libraryTree);
        ImageView btnPalma = findViewById(R.id.btnPalma);
        ImageView btnSiete = findViewById(R.id.btnSiete);
        ImageView btnGuayacan = findViewById(R.id.btnGuayacan);
        ImageView btnRoble = findViewById(R.id.btnRoble);
        ImageView btnNogal = findViewById(R.id.btnNogal);
        ImageView btnCeiba = findViewById(R.id.btnCeiba);

        btnPalma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpPalma.class);
                startActivity(intent);
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpSiete.class);
                startActivity(intent);
            }
        });

        btnGuayacan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpGuayacan.class);
                startActivity(intent);
            }
        });

        btnRoble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpRoble.class);
                startActivity(intent);
            }
        });

        btnNogal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpNogal.class);
                startActivity(intent);
            }
        });

        btnCeiba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SpCeiba.class);
                startActivity(intent);
            }
        });

    }
}