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
        System.out.println("[ObserverVelocidad] Se ha cambiado la velocidad: " + arg.velocidad + "km/hr");
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.matricula, arg.velocidad);

    }
}
