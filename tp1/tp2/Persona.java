package tp1.tp2;
public class Persona {
//atributos
    String nombre;
    String apellido;
    int edad;
    int dni;
//constructor
    public Persona (String nombre, String apellido, int edad, int dni)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.dni=dni;
    }
//metodos gets y sets
    public String getNombre()
    {
        return nombre;
    }   
    public void setNombre(String nombre){
        this.nombre=nombre;
    } 
//persona
    public boolean mayorDeEdad()
    {
        if (edad>=18)
            return true;
        else
            return false;
    }
//creacion y declaracion de objetos
public class testPersona ()
    public static void main (String args[]) 
    { 
        int numero
        Persona alumno 
        Persona1=new Persona ("Franco", "Herrera", 42, 1234);
        Persona2=new Persona ("Felipe", "Costa", 38, 1255);
        System.out.print(Persona.mayorDeEdad());
    }

}