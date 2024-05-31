package com.cod.mvc;

import com.cod.mvc.controller.Controller;
import com.cod.mvc.model.Model;

public class App {

    public static void main(String[] args) {
        // Inicializamos la app
        // instanciamos el modelo
        Model miModel = new Model();
        // instanciamos el controlador
        // le pasamos el Model instanciado
        Controller miController = new Controller(miModel);

        // Crear tres coches
        miController.crearCoche("LaFerrari", "SBC 1234");
        miController.crearCoche("Alpine", "HYU 4567");
        miController.crearCoche("Aston Martin", "FGH 3333");

        miController.buscarPorMatricula("SBC 1234");

        // Cambiar la velocidad de un coche
        miController.cambiarVelocidad("SBC 1234", 30);


    }
}