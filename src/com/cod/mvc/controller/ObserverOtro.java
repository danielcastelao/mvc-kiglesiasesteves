package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;

/**
 * La clase ObserverOtro implementa la interfaz Observer.
 * Esta clase se utiliza para observar cambios en los objetos Coche.
 */
public class ObserverOtro implements Observer {
    /**
     * Este método se llama cada vez que el objeto observado cambia.
     * Una aplicación llama al método notifyObservers del objeto Observable
     * para que todos los observadores del objeto sean notificados del cambio.
     *
     * @param arg el objeto que ha cambiado.
     */
    @Override
    public void update(Coche arg) {
        System.out.println("Yo tambien me enteré que la velocidad cambio en " + arg.toString());


    }
}