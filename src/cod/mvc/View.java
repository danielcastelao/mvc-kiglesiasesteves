package cod.mvc;

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
        System.out.println("The speed of car " + matricula + " is " + velocidad);
    }
}
