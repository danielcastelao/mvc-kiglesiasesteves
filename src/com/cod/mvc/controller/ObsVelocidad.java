package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

public class ObsVelocidad  implements Observer {

    /**
     * Este método es llamado siempre que hay un cambio
     * El observable cuando hace el notifyObservers
     * 'dispara' todos los update de los Observers
     *
     * @param arg el argumento pasado por el observable, el coche actualizado
     */
    @Override
    public void update(Coche arg) {
        System.out.println("Se ha cambiado la velocidad: " + String.valueOf(arg.velocidad));
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());

        // Si la velocidad es mayor que 120, reducimos la velocidad en 10
        if (arg.getVelocidad() > 120) {
            int nuevaVelocidad = arg.getVelocidad() - 10;
            arg.setVelocidad(nuevaVelocidad);
            System.out.println("La velocidad es mayor que 120, se ha reducido a: " + nuevaVelocidad);
        }
    }
}
