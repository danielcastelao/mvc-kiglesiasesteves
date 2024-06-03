package com.cod.mvc.model;

import com.cod.mvc.controller.ObsCoche;
import com.cod.mvc.controller.Observer;

import java.util.ArrayList;

public class Model implements Observable {
    private ObsCoche obsCoche;

    /**
     * Lista de coches en el parking
     */
    private static ArrayList<Coche> parking = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a los observadores
     * Se ejecutará el método update() de cada observador
     *
     * @param coche
     */
    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers) {
            observer.update(coche);
        }
    }

    /**
     * Crea un coche y lo añade al parking
     *
     * @param matricula Matrícula del coche
     * @param modelo    Modelo del coche
     */
    public Coche crearCoche(String modelo, String matricula) {
        Coche aux = Coche.getInstance(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca un coche en el parking por su matrícula
     *
     * @param matricula Matrícula del coche a buscar
     * @return Coche encontrado o null si no existe
     */
    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.getMatricula().equals(matricula)) {
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @param velocidad Nueva velocidad
     */
    public void cambiarVelocidad(String matricula, int velocidad) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setVelocidad(velocidad);
            notifyObservers(getCoche(matricula));

        }
    }

    /**
     * Obtiene la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @return Velocidad del coche o -1 si no existe
     */
    public static int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return -1;
    }
    public void setObsCoche(ObsCoche obsCoche) {
        this.obsCoche = obsCoche;
    }
    public void notifyObsCoche(Coche coche) {
        if (obsCoche != null) {
            obsCoche.update(coche);
        }
    }
    /**
     * Aumenta la velocidad del coche identificado por la matrícula en 'v' unidades.
     * Notifica a los observadores del cambio en la velocidad.
     * @param matricula identificador del coche.
     * @param v unidades a aumentar la velocidad.
     */
    public void subirVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            coche.setPreviousVelocidad(coche.getVelocidad());
            coche.setVelocidad(coche.getVelocidad() + v);
            notifyObservers(coche);
        }
    }

    /**
     * Disminuye la velocidad del coche identificado por la matrícula en 'v' unidades.
     * Notifica a los observadores del cambio en la velocidad.
     * @param matricula identificador del coche.
     * @param v unidades a disminuir la velocidad.
     */
    public void bajarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);
        if (coche != null && coche.getVelocidad() >= v) {
            coche.setPreviousVelocidad(coche.getVelocidad());
            coche.setVelocidad(coche.getVelocidad() - v);
            notifyObservers(coche);
        }
    }


}


