package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

/**
 * ObsVelocidad es una implementación de la interfaz Observer.
 * Se encarga de actualizar la vista cada vez que hay un cambio en la velocidad de un coche.
 */
public class ObsVelocidad implements Observer {

    /**
     * Este método es llamado siempre que hay un cambio.
     * El observable, cuando hace el notifyObservers, 'dispara' todos los update de los Observers.
     *
     * @param arg el argumento pasado por el observable, el coche actualizado.
     */
    @Override
    public void update(Coche arg) {
        if (sube(arg)) {
            View.subeVelocidad(arg.getMatricula(), arg.getVelocidad(), arg.getPreviousVelocidad());
        } else {
            View.bajaVelocidad(arg.getMatricula(), arg.getVelocidad(), arg.getPreviousVelocidad());
        }
        // le comunicamos a la vista que muestre la velocidad
        View.muestraVelocidad(arg.getMatricula(), arg.getVelocidad());
    }

    /**
     * Determina si la velocidad del coche ha subido.
     *
     * @param arg el coche cuya velocidad se está comparando.
     * @return true si la velocidad actual es mayor que la velocidad anterior, false en caso contrario.
     */
    private static boolean sube(Coche arg) {
        return arg.getVelocidad() > arg.getPreviousVelocidad();
    }
}
