package com.cod.mvc;

import static com.cod.mvc.model.Model.crearCoche;
import static com.cod.mvc.view.View.muestraVelocidad;

public class App {
    public static void main(String[] args) {
        crearCoche("67JUzf", "HUnday", 345);
        muestraVelocidad("67JUzf", 345);
    }
}
