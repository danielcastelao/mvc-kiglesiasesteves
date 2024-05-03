package cod.mvc;

import static cod.mvc.Model.CambiarVelocidad;
import static cod.mvc.Model.getVelocidad;

public class View {

    public static int  muestraVelocidad(String matricula, int velocidad){

        CambiarVelocidad(matricula,velocidad);
        return getVelocidad(matricula);


    }
}
