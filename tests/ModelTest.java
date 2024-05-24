import com.cod.mvc.model.Coche;
import com.cod.mvc.model.Model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ModelTest {
    @Test
    public void testCrearCoche() {
        Model.crearCoche("1234ABC", "Modelo1", 100);
        Coche coche = Model.getCoche("1234ABC");
        assertEquals("1234ABC", coche.getMatricula());
        assertEquals("Modelo1", coche.getModelo());
        assertEquals(100, coche.getVelocidad());
    }

    @Test
    public void testGetCoche() {
        Model.crearCoche("1234ABC", "Modelo1", 100);
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
        Model.crearCoche("1234ABC", "Modelo1", 100);
        Model.cambiarVelocidad("1234ABC", 150);
        Coche coche = Model.getCoche("1234ABC");
        assertEquals(150, coche.getVelocidad());
    }

    @Test
    public void testGetVelocidad() {
        Model.crearCoche("1234ABC", "Modelo1", 100);
        int velocidad = Model.getVelocidad("1234ABC");
        assertEquals(100, velocidad);
    }

    @Test
    public void testGetVelocidadNotFound() {
        int velocidad = Model.getVelocidad("0000XYZ");
        assertEquals(-1, velocidad);
    }
}