package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

/**
 * La clase ObserverOtro implementa la interfaz Observer.
 * Esta clase se utiliza para observar cambios en los objetos Coche.
 */
public class ObserverLimite implements Observer {
    final static int LIMITE = 120;

    /**
     * Este es el observador de límite de velocidad
     *
     * @param arg coche al que se le actualizó la velocidad
     */
    @Override
    public void update(Coche arg) {
        // verificamos velocidad máxima
        if (arg.getVelocidad() > LIMITE) {
            int nuevaVelocidad = arg.getVelocidad() - 10;
            arg.setVelocidad(nuevaVelocidad);
            System.out.println("La velocidad es mayor que 120, se ha reducido a: " + nuevaVelocidad);
        }
    }
}

