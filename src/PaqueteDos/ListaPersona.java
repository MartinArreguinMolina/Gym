package PaqueteDos;

import PaqueteUno.Persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ListaPersona {

    private BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    private Eliminar ob1;
    private VerLista ob2;
    
    public Stack<Persona> lista = new Stack<>();

    private String nombre;
    private String apellido;
    
    private int edad;
    private int id;
    private int opcion;
    
    public void menu() throws IOException{
        ob1 = new Eliminar();
        ob2 = new VerLista();
        
        System.out.println("1.Agregar usuario"
                + "\n2.Eliminar usuario"
                + "\n3.Ver lista");
        System.err.print("R= ");
        opcion = Integer.parseInt(bufer());
        
        switch(opcion){
            case 1:
                agregarDatos();
                break;
            case 2:
                ob1.eliminar(lista);
                break;
            case 3:
                ob2.verLista(lista);
                break;
        }
    }

    private void agregarDatos() throws IOException {
        System.out.println("");
        System.out.print("Dame el nombre del usuarion : ");
        nombre = bufer();
        System.out.print("Dame el apellido: ");
        apellido = bufer();
        System.out.print("Dame la edad : ");
        edad = Integer.parseInt(bufer());
        System.out.print("Dame el id : ");
        id = Integer.parseInt(bufer());

        lista.add(new Persona(nombre, apellido, edad, id));
    }

    private  String bufer() throws IOException {
        String entrada;
        entrada = bufer.readLine();

        return entrada;
    }
    
    public void setLista(Stack<Persona> x){
        this.lista = x;
    }
}
