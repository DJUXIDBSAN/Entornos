# Primer paso!

- import org.junit.Test;

- import static org.junit.Assert.assertEquals;

Se importa la clase Test de JUnit, que se utiliza para definir métodos de prueba.
Se importa el método assertEquals estático de la clase org.junit.Assert, que se utiliza para verificar si dos valores son iguales.

# Segundo paso!
- public class PersonaTest {

Se define la clase PersonaTest, que contiene los métodos de prueba para la clase Persona.

# Tercer paso!
- Persona alumno = new Persona("Noah", 16, 8);

Se crea una instancia de la clase Persona llamada alumno con el nombre "Noah", la edad 16 y la nota 8.

# Cuarto paso!
- @Test
    public void testGetEdad(){
        assertEquals(14, alumno.getEdad());
    }


Se define un método de prueba llamado testGetEdad(), que verifica si el método getEdad() de la instancia alumno devuelve el valor esperado (14).
Se utiliza assertEquals para comparar el valor esperado (14) con el valor devuelto por alumno.getEdad(). Si los valores no son iguales, el método de prueba fallará.

