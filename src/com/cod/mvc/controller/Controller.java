package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;

public class Controller {

    // definimos la instancia del modelo
    private final Model miModel;

    /**
     * Constructor. Inicializamos el controller
     * Creamos los observadores que necesitamos
     *
     * @param miModel
     */
    public Controller(Model miModel) {
        this.miModel = miModel;

        // instanciamos al observador de la velocidad
        ObsVelocidad observoVelocidad = new ObsVelocidad();
        miModel.addObserver(observoVelocidad);

        // instanciamos un segundo observador para el límite de velocidad
        ObserverLimite observoLimite = new ObserverLimite();
        miModel.addObserver(observoLimite);

        // instanciamos un tercer observador para buscar por matrícula
        ObsCoche observoCoche=new ObsCoche();
        miModel.setObsCoche(observoCoche);
    }

    /**
     * Crea un coche
     *
     * @param nombre    del coche
     * @param matricula del coche
     */
    public void crearCoche(String nombre, String matricula) {
        miModel.crearCoche(nombre, matricula);

    }

    /**
     * Cambia la velocidad de un coche
     *
     * @param matricula del coche
     * @param velocidad nueva
     */
    public void cambiarVelocidad(String matricula, Integer velocidad) {
        miModel.cambiarVelocidad(matricula, velocidad);
    }

    /**
     * Busca la matrícula de un coche
     *
     * @param matricula del coche
     * @return el Coche al que pertenece la matrícula o null en caso de que  no exista ese coche;
     */
    //crear método para buscar porMatrícula
    public Coche buscarPorMatricula(String matricula) {
        Coche coche = Model.getCoche(matricula);
        if (coche != null) {
            miModel.notifyObsCoche(coche);
        } else {
            System.out.println("No se ha encontrado un coche con esas característica");
        }
        return coche;
    }
}




