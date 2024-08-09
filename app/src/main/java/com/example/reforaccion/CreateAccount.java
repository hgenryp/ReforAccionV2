package com.example.reforaccion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.reforaccion.helper.validation;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // Sección de estilo de botones
        Button buttonCreate = findViewById(R.id.buttonCreate);
        TextView termsC = findViewById(R.id.termsC);
        EditText NombreUser = findViewById(R.id.editNombreUser);
        TextView errorUser = findViewById(R.id.errorUser);
        EditText emailText = findViewById(R.id.emailText);
        EditText editTelefono = findViewById(R.id.editTelefono);
        RadioButton radioButton = findViewById(R.id.radioButton);
        EditText passwordEditText1 = findViewById(R.id.editTextTextPassword5);
        EditText passwordEditText2 = findViewById(R.id.editTextTextPassword4);
        ImageButton togglePasswordVisibilityButton1 = findViewById(R.id.imageButton3);
        ImageButton togglePasswordVisibilityButton2 = findViewById(R.id.imageButton2);

        termsC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Politicas.class);
                startActivity(intent);
            }
        });

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Politicas.class);
                startActivity(intent);
            }
        });

        togglePasswordVisibilityButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordEditText1.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    passwordEditText1.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    togglePasswordVisibilityButton1.setImageResource(R.drawable.baseline_visibility_off_24);
                } else {
                    passwordEditText1.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    togglePasswordVisibilityButton1.setImageResource(R.drawable.baseline_visibility_24);
                }
                // Mueve el cursor al final del texto
                passwordEditText1.setSelection(passwordEditText1.getText().length());
            }
        });

        togglePasswordVisibilityButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordEditText2.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    passwordEditText2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    togglePasswordVisibilityButton2.setImageResource(R.drawable.baseline_visibility_off_24);
                } else {
                    passwordEditText2.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    togglePasswordVisibilityButton2.setImageResource(R.drawable.baseline_visibility_24);
                }
                // Mueve el cursor al final del texto
                passwordEditText2.setSelection(passwordEditText2.getText().length());
            }
        });

        //Seccion de gestión de datos
        buttonCreate.setOnClickListener(viwe -> {
            validation.validarEditText(NombreUser, errorUser, "nombre", 8, 25, this);
            validation.validarEditText(emailText, errorUser, "email", 8, 20, this);
        });
    }
}