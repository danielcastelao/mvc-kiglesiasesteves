package cod.mvc;

import static cod.mvc.Model.crearCoche;
import static cod.mvc.View.muestraVelocidad;

public class App {
    public static void main(String[] args) {
        crearCoche("67JUzf", "HUnday", 345);
        muestraVelocidad("67JUzf", 345);
    }
}
