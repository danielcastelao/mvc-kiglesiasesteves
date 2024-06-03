package com.cod.mvc.view;

import com.cod.mvc.model.Coche;

/**
 * Clase que muestra la información de un coche.
 */
public class View {
    /**
     * Muestra la velocidad de un coche.
     *
     * @param matricula Matrícula del coche.
     * @param velocidad Velocidad del coche.
     */
    public static void muestraVelocidad(String matricula, int velocidad) {
        System.out.println("La velocidad del coche con " + matricula + " es " + velocidad);
    }

    /**
     * Muestra todos los datos de un coche.
     *
     * @param coche Objeto Coche cuyos datos se van a mostrar.
     */
    public static void muestraTodosDatos(Coche coche) {
        System.out.println("Matrícula: " + coche.getMatricula());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad: " + coche.getVelocidad());
    }

    /**
     * Informa que la velocidad de un coche ha subido.
     *
     * @param matricula Matrícula del coche.
     * @param velocidad Nueva velocidad del coche.
     * @param previousVelocidad Velocidad anterior del coche.
     */
    public static void subeVelocidad(String matricula, int velocidad, int previousVelocidad) {
        System.out.println("[ObserverVelocidad] Se ha aumentado la velocidad del coche " + matricula + " en: " + (velocidad - previousVelocidad) + " km/hr");
    }

    /**
     * Informa que la velocidad de un coche ha bajado.
     *
     * @param matricula Matrícula del coche.
     * @param velocidad Nueva velocidad del coche.
     * @param previousVelocidad Velocidad anterior del coche.
     */
    public static void bajaVelocidad(String matricula, int velocidad, int previousVelocidad) {
        System.out.println("[ObserverVelocidad] Se ha reducido la velocidad del coche " + matricula + " en: " + (previousVelocidad - velocidad) + " km/hr");
    }
}
