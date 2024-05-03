package cod.mvc;

import static cod.mvc.Model.CrearCoche;
import static cod.mvc.View.muestraVelocidad;

public class Controller {
    public static void main(String[] args) {
        CrearCoche("67JUzf", "HUnday", 345);
        System.out.println("La velocidad del coche es "+ muestraVelocidad("67JUzf", 110));
    }
}