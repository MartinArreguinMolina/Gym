package PaqueteTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import PaqueteUno.PersonaDiscapacidad;
import PaqueteCinco.Validar;

public class ListaPersonaDiscapacidad {

    private BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

    private Eliminar ob1;
    private VerLista ob2;
    private Validar ob3 = new Validar();

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
        System.out.println("");
        ob1 = new Eliminar();
        ob2 = new VerLista();

        do {
            System.out.println("");
            do {
                System.out.println("1.Agregar usuariuo"
                        + "\n2.Eliminar usuario"
                        + "\n3.Ver lista"
                        + "\n4.Salir");
                System.out.print("R= ");
                do {
                    try {
                        opcion = Integer.parseInt(bufer());
                        x1 = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Debes de digitar un numero...");
                        x1 = false;
                    }

                } while (x1 == false);

            } while (opcion < 1 || opcion > 4);

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
            
            System.out.println("");
        } while (x == false);
        
        System.out.println("");
    }

    private void agregarDatos() throws IOException {
        System.out.println("");
        System.out.print("Dame el nombre del usuario : ");
        nombre();
        System.out.print("Dame el apellido : ");
        apellido();
        System.out.print("Dame la dicapacidad que tiene el usuario : ");
        discapacidad();
        System.out.print("Dame la edad : ");
        edad();
        System.out.print("Dame el id : ");
        id();

        lista.push(new PersonaDiscapacidad(nombre, apellido, edad, discapacidad, id));
    }

    private void nombre() throws IOException {
        nombre = bufer();

        if (!ob3.validar(nombre)) {
            System.out.println("Debes de digitar unicamente letras");
            System.out.print("Dame el nombre del usuario : ");
            nombre();
        }
        
        System.out.println("");
    }

    private void apellido() throws IOException {
        apellido = bufer();

        if (!ob3.validar(apellido)) {
            System.out.println("Debes de digitar unicamente letras");
            System.out.print("Dame el apellido : ");
            apellido();
        }
        System.out.println("");
    }

    private void discapacidad() throws IOException {
        discapacidad = bufer();

        if (!ob3.validar(discapacidad)) {
            System.out.println("Debes de digitar unicamente letras");
            System.out.print("Dame la discapacidad : ");
            discapacidad();
        }
        System.out.println("");
    }

    private void edad() throws IOException {
        try {
            edad = Integer.parseInt(bufer());
        } catch (NumberFormatException e) {
            System.out.println("Debes de digitar unicamente numeros...");
            System.out.print("Dame la edad : ");
            edad();
        }
        System.out.println("");
    }

    private void id() throws IOException {
        boolean x = false;
        int pos = 0;

        try {
            id = Integer.parseInt(bufer());
        } catch (NumberFormatException e) {
            System.out.println("Debes de digitar unicamente numeros...");
            System.out.print("Dame el id : ");
            id();
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                pos = i;
                x = true;
                break;
            }
        }

        if (x) {
            System.out.println("El id debe de ser unico para cada usuario el id que digitaste pertece al usuario " + lista.get(pos).getNombre());
            System.out.print("Dame el id : ");
            id();
        }
        System.out.println("");
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
