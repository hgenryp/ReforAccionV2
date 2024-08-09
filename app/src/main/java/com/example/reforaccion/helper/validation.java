package com.example.reforaccion.helper;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class validation {

    public static void validarEditText(
            EditText editText,
            TextView errorTextView,
            String Usuario ,int min, int max, Context context) {

        String text = editText.getText().toString();
        String mensaje = "";
        if (text.isEmpty()) {
            mensaje = "El campo " + Usuario + " no puede estar vacío";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }

        if (text.length() < min || text.length() > max) {
            mensaje = "El campo " + Usuario + " debe tener entre " + min + " y " + max + " caracteres";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
    }
}
