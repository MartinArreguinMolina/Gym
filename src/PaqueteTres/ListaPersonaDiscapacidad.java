package PaqueteTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import PaqueteUno.PersonaDiscapacidad;

public class ListaPersonaDiscapacidad {

    private BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    ;
    private Eliminar ob1;
    private VerLista ob2;

    private Stack<PersonaDiscapacidad> lista = new Stack<>();

    private String nombre;
    private String apellido;
    private String discapacidad;

    private int edad;
    private int id;
    private int opcion;

    private boolean x = false;
    private boolean x1 = false;

    public void menu() throws IOException {
        ob1 = new Eliminar();
        ob2 = new VerLista();

        do {
            System.out.println("1.Agregar usuariuo"
                    + "\n2.Eliminar usuario"
                    + "\n3.Ver lista");
            System.out.print("R= ");
            do{
                
            }while(x1 == false);
            try {
                opcion = Integer.parseInt(bufer());
                x1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes de digitar un numero...");
                x1 = false;
            }

            switch (opcion) {
                case 1:
                    agregarDatos();
                    break;
                case 2:
                    ob1.eliminar(lista);
                    break;
                case 3:
                    ob2.verLista(lista);
                    break;
                case 4:
                    x = true;
                    break;
            }

        } while (x == false);

    }

    private void agregarDatos() throws IOException {
        System.out.print("Dame el nombre del usuario : ");
        nombre = bufer();
        System.out.print("Dame el apellido : ");
        apellido = bufer();
        System.out.print("Dame la dicapacidad que tiene el usuario : ");
        discapacidad = bufer();
        System.out.print("Dame la edad : ");
        edad = Integer.parseInt(bufer());
        System.out.print("Dame el id : ");
        id = Integer.parseInt(bufer());

        lista.push(new PersonaDiscapacidad(nombre, apellido, edad, discapacidad, id));
    }

    private String bufer() throws IOException {
        String entrada;
        entrada = bufer.readLine();

        return entrada;
    }

    public void setLista(Stack<PersonaDiscapacidad> x) {
        this.lista = x;
    }
}
