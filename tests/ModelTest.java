
    import cod.mvc.Coche;
    import cod.mvc.Model;
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

    class ModelTest {
        @Test
        public void testCrearCoche() {
            Coche coche = Model.CrearCoche("1234ABC", "Modelo1", 100);
            assertEquals("1234ABC", coche.matricula);
            assertEquals("Modelo1", coche.modelo);
            assertEquals(100, coche.velocidad);
        }

        @Test
        public void testGetCoche() {
            Model.CrearCoche("1234ABC", "Modelo1", 100);
            Coche coche = Model.getCoche("1234ABC");
            assertEquals("1234ABC", coche.matricula);
        }

        @Test
        public void testGetCocheNotFound() {
            Coche coche = Model.getCoche("0000XYZ");
            assertNull(coche);
        }

        @Test
        public void testCambiarVelocidad() {
            Model.CrearCoche("1234ABC", "Modelo1", 100);
            Coche coche = Model.CambiarVelocidad("1234ABC", 150);
            assertEquals(150, coche.velocidad);
        }

        @Test
        public void testGetVelocidad() {
            Model.CrearCoche("1234ABC", "Modelo1", 100);
            int velocidad = Model.getVelocidad("1234ABC");
            assertEquals(100, velocidad);
        }

        @Test
        public void testGetVelocidadNotFound() {
            int velocidad = Model.getVelocidad("0000XYZ");
            assertEquals(-1, velocidad);
        }
    }

