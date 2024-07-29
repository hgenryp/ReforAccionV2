package com.example.reforaccion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SpNogal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_nogal);

        ImageButton meanMenu = findViewById(R.id.meanMenu);
        ImageButton atrasBtn = findViewById(R.id.atrasBtn);
        ImageButton animalBtn = findViewById(R.id.dangeranimal);
        ImageButton tipsBtn = findViewById(R.id.tipsrecom);
        ImageButton fichaBtn = findViewById(R.id.libraryTree);

        meanMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoriesBtn.class);
                startActivity(intent);
            }
        });

        atrasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Species.class);
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

    }
}