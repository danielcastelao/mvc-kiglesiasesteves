package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

public class ObsCoche implements Observer{
    @Override
    public void update(Coche coche) {
        System.out.println("[ObserverCoche] Se ha encontrado un coche con matrícula: " + coche.getMatricula());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad: " + coche.getVelocidad());
    }
}
