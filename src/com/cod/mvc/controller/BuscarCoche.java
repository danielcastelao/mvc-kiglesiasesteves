package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class BuscarCoche {

    public Coche buscarPorMatricula(String matricula) {
        Coche coche = Model.getCoche(matricula);
        if (coche != null) {
         return coche;
        } else {
            return null;
        }
    }
}
