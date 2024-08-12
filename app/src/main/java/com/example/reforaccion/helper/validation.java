package com.example.reforaccion.helper;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class validation {

    public static void validarEditText(
            EditText editText,
            TextView errorTextView,
            String Usuario, int min, int max, Context context) {

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
        if (!text.matches("[a-zA-ZÁÉÍÓÚáéíóúñ-\\s] {" + min + "," + max + "}S")) {
            mensaje = "El campo " + Usuario + " solo puede contener letras";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
    }

    public static void validarEmail(TextView email, TextView errorTextView, Context context) {
        String text = email.getText().toString();
        String mensaje = "";
        if (text.isEmpty()) {
            mensaje = "El campo email no puede estar vacío";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
        if (!text.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            mensaje = "El campo email no contiene una direccion de correo valida";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
    }

    public static void validarTelefono(EditText telefono, String Telefono, int min, int max, TextView errorTextView, Context context) {
        String text = telefono.getText().toString();
        String mensaje = "";
        if (text.isEmpty() && text.length() < min) {
            mensaje = "El campo " + Telefono + " no puede estar vacío o debe contener al menos " + min + " caracteres";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
        if (text.isEmpty() && text.length() > max) {
            mensaje = "El campo " + Telefono + " no puede estar vacío o debe contener maximo " + max + " caracteres";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            return;
        }
    }

    public static void validarPassword(
            EditText editPassword,
            EditText editPassword2,
            TextView errorTextView,
            TextView errorTextView2,
            String password, int min, int max, Context context) {

        String pass = editPassword.getText().toString();
        String pass2 = editPassword2.getText().toString();
        String mensaje = "";
        if (pass.isEmpty()) {
            mensaje = "El campo " + password + " no puede estar vacío";
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            errorTextView2.setText(mensaje);
            errorTextView2.setVisibility(TextView.VISIBLE);
            return;
        }
        if (pass.length() < min || pass.length() > max) {
            mensaje = "El campo " + password + " debe tener entre " + min + " y " + max + " caracteres";
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            errorTextView2.setText(mensaje);
            errorTextView2.setVisibility(TextView.VISIBLE);
            return;
        }
        if (!pass.equals(pass2)) {
            mensaje = "Las contraseñas no coinciden";
            errorTextView.setText(mensaje);
            errorTextView.setVisibility(TextView.VISIBLE);
            errorTextView2.setText(mensaje);
            errorTextView2.setVisibility(TextView.VISIBLE);
            return;
        }
    }
}
