import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ModelTest {
    Model model = new Model();

    @Test
    public void testCrearCoche() {
        model.crearCoche("Modelo1", "1234ABC");
        Coche coche = Model.getCoche("1234ABC");
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("Modelo1", coche.getModelo());
    }

    @Test
    public void testSubirVelocidad() {
        Model model = new Model();
        Coche coche = model.crearCoche("Mercedes", "BXK 1234");
        coche.setVelocidad(50);

        model.subirVelocidad(coche.getMatricula(), 20);

        assertEquals(70, coche.getVelocidad());
    }

    @Test
    public void testBajarVelocidad() {
        Model model = new Model();
        Coche coche = model.crearCoche("Mercedes", "BXK 1234");
        coche.setVelocidad(50);

        model.bajarVelocidad(coche.getMatricula(), 30);

        assertEquals(20, coche.getVelocidad());
    }

    @Test
    public void testGetCoche() {
        model.crearCoche("Modelo1", "1234ABC");
        Coche coche = Model.getCoche("1234ABC");
        assertEquals("1234ABC", coche.getMatricula());
    }

    @Test
    public void testGetCocheNotFound() {
        Coche coche = Model.getCoche("0000XYZ");
        assertNull(coche);
    }

    @Test
    public void testCambiarVelocidad() {
        model.crearCoche("Modelo1", "1234ABC");
        model.cambiarVelocidad("1234ABC", 150);
        Coche coche = Model.getCoche("1234ABC");
        assertEquals(150, coche.getVelocidad());
    }
}