package cod.mvc;

import java.util.ArrayList;

public class Model {
    ArrayList<Coche> parking = new ArrayList<Coche>();

    public Coche CrearCoche(String matricula, String modelo, int velocidad){
        Coche coche = new Coche();
        coche.matricula = matricula;
        coche.modelo = modelo;
        coche.velocidad = velocidad;
        parking.add(coche);
        return coche;
    }

    public Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
            return null;
        }
        return null;
    }
}
