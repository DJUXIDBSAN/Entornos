public class Persona {
    private String nombre ;
    private int edad;
    private int dni;

//constructor completo
public Persona (String nuevoNombre, int nuevaEdad, int nuevoDNI ){
    nombre=nuevoNombre;
    edad=nuevaEdad;
    dni=nuevoDNI;
}
//construcotr vacio
    public Persona (){

    }
//fin de constructor
   public String getNombre(){
        return nombre;
    }
    public void setNombre(String nuevoNombre){
        nombre=nuevoNombre;
    }
   public int getEdad(){
        return edad;
    }
    public void setEdad(int nuevaEdad){
        edad=nuevaEdad;
    }
   public int getDNI(){
        return dni;
    }
    public void setDNI(int nuevoDNI){
        dni=nuevoDNI;
    }



}
