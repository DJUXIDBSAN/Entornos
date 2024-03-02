import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Esta clase proporciona pruebas unitarias para la clase Persona.
 */
public class PersonaTest {

    // Se instancia un objeto de tipo Persona para utilizarlo en las pruebas
    Persona alumno = new Persona("Noah", 16, 8);

    /**
     * Prueba para verificar el método getEdad de la clase Persona.
     * Comprueba si la edad devuelta es la esperada.
     */
    @Test
    public void testGetEdad(){
        // Se verifica si el método getEdad devuelve la edad esperada (14)
        assertEquals(14, alumno.getEdad());
    }
}


