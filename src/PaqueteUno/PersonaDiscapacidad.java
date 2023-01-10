package PaqueteUno;

public class PersonaDiscapacidad extends Persona {
    private String discapacidad;

    public PersonaDiscapacidad(String nombre, String apellido, int edad, String discapacidad , int id) {
        super(nombre, apellido, edad, id);
        this.discapacidad = discapacidad;
    }

    public String getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(String discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    public String toString(){
         return "::::::::::::::::::::" + "\n" + "Nombre : " + getNombre() + "\n" + "Apellido " + getApellido() + "\n" + "Edad : " + getEdad() + "\n" + "Id : " + getId() + "\n" + "Discapacidad : " + getDiscapacidad() + "\n" + "::::::::::::::::::::";
    }

}
