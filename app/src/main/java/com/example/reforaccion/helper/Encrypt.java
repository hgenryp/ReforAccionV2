package com.example.reforaccion.helper;

import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {

    public static String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte hashByte : hashBytes) {
                String hex = Integer.toHexString(0xff & hashByte);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
                }
                return hexString.toString();
        }catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }
    public static boolean validateEncryptedPassword(String password, String storedPassword) {
        String encryptedPassword = encryptPassword(password);

        Log.e("msg", "Contraseña ingresada encriptada: " + encryptedPassword);
        Log.e("msg", "Contraseña almacenada BD: " + storedPassword);

        boolean valid = encryptedPassword.equals(storedPassword);
        Log.e("msg", "Contraseña válida: " + valid);
        return valid;
    }
}
