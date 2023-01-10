
package PaqueteUno;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int id;

    public Persona(String nombre, String apellido, int edad, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "::::::::::::::::::::" + "\n" + "Nombre : " + getNombre() + "\n" + "Apellido " + getApellido() + "\n" + "Edad : " + getEdad() + "\n" + "Id : " + getId() + "\n" + "::::::::::::::::::::";
    }
    
    
    
}
