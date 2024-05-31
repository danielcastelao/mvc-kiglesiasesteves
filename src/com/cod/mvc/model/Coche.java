package com.cod.mvc.model;

public class Coche {
    private static Coche instance = null;

    private String matricula;
    private String modelo;
    private int velocidad;

    private Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public static Coche getInstance(String modelo, String matricula) {
        if (instance == null) {
            instance = new Coche(modelo, matricula);
        }
        return instance;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}