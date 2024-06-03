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
        if (sube(arg)) {
View.subeVelocidad(arg.getMatricula(), arg.getVelocidad(), arg.getPreviousVelocidad());        }
        else {

View.bajaVelocidad(arg.getMatricula(), arg.getVelocidad(), arg.getPreviousVelocidad());        }
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());

    }

    private static boolean sube(Coche arg) {
        return arg.getVelocidad() > arg.getPreviousVelocidad();
    }
}
