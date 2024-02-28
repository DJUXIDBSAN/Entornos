import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonaTest {
    Persona alumno = new Persona("Noah", 16, 8);

    @Test
    public void testGetEdad(){
        assertEquals(14, alumno.getEdad());

    }
}

