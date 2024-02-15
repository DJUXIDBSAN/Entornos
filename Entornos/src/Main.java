// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int edad = 20;
       String nombre = "Noah";
//costructor completo
        Persona alumno = new Persona("Noah",20,124463634);
//construcotr vacio
        Persona alumno2 = new Persona();

        alumno2.setNombre("niki");
        alumno2.setEdad(11);
        alumno2.setDNI(2394345);
//fin de constructor
        if (alumno.getEdad() > edad){
            System.out.println(alumno.getNombre() + "es mayor que " + nombre);
        } else if (alumno.getEdad() == edad){
            System.out.println(alumno.getNombre() + " y " + nombre + "tienen la misma edad");
        } else {
            System.out.println(alumno.getNombre() + "es menor que " + nombre);
        }
    }

}