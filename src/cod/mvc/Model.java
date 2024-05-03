package cod.mvc;

import java.util.ArrayList;

public class Model {
    static ArrayList<Coche> parking = new ArrayList<Coche>();

    public static Coche CrearCoche(String matricula, String modelo, int velocidad){
        Coche coche = new Coche();
        coche.matricula = matricula;
        coche.modelo = modelo;
        coche.velocidad = velocidad;
        parking.add(coche);
        return coche;
    }

    public static Coche getCoche(String matricula) {
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche;
            }
            return null;
        }
        return null;
    }


    public static Coche CambiarVelocidad(String matricula, int nuevaVelocidad){

        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                coche.velocidad = nuevaVelocidad;
                return coche;
            }
        }
        return null;
    }
    public static  int getVelocidad(String matricula){
        for (Coche coche : parking) {
            if (coche.matricula.equals(matricula)) {
                return coche.velocidad;
            }
        }
        return -1;
    }
}
