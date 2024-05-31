package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;


public class ObsCoche implements Observer{
    @Override
    public void update(Coche coche) {
        System.out.println("[ObserverCoche] Se ha encontrado un coche con esa  matrícula: ");
        View.muestraTodosDatos(coche);
    }
}
