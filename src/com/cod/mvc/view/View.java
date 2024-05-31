package com.cod.mvc.view;

import com.cod.mvc.model.Coche;

/**
 * Clase que muestra la velocidad de un coche
 */

public class View {
    /**
     * Muestra la velocidad de un coche
     *
     * @param matricula Matrícula del coche
     * @param velocidad Velocidad del coche
     */
    public static void muestraVelocidad(String matricula, int velocidad) {
        System.out.println("La velocidad del coche con " + matricula + " es " + velocidad);
    }
    public static void muestraTodosDatos(Coche coche){
        System.out.println("Matrícula: " + coche.getMatricula());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad: " + coche.getVelocidad());
    }
}
