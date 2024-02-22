import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonaTest {
    Persona alumno = new Persona("Noah", 24, 8);

    @Test
    public void testGetEdad(){
        assertEquals(24, alumno.getEdad());

    }
}
