package com.example.reforaccion.models;

import android.app.Application;

public class User extends Application {
    private String nombre;
    public String email;
    private String telefono;
    public String password;

    public User() {
        this.nombre = "";
        this.email = "";
        this.telefono = "";
        this.password = "";
    }

    public User(String nombre, String email, String telefono, String password) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
    }

    public void setDefaultData() {
        this.nombre = "";
        this.email = "";
        this.telefono = "";
        this.password = "";
    }

    public void copyData(User newData) {
        this.nombre = newData.nombre;
        this.email = newData.email;
        this.telefono = newData.telefono;
        this.password = newData.password;
    }
}