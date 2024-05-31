package com.cod.mvc.controller;

import com.cod.mvc.model.Coche;
import com.cod.mvc.view.View;

/**
 * La clase ObsCoche implementa la interfaz Observer.
 * Esta clase se utiliza para observar los cambios en los objetos Coche y realizar acciones cuando se notifican estos cambios.
 */
public class ObsCoche implements Observer {


    /**
     * Este método se llama cuando se notifican cambios en un objeto Coche.
     * Imprime un mensaje y muestra todos los datos del coche.
     *
     * @param coche el coche que ha cambiado
     */
    @Override
    public void update(Coche coche) {
        System.out.println("[ObserverCoche] Se ha encontrado un coche con esa  matrícula: ");
        View.muestraTodosDatos(coche);
    }
}