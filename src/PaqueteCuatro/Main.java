package PaqueteCuatro;

import PaqueteDos.ListaPersona;
import PaqueteTres.ListaPersonaDiscapacidad;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    private int opcion;
    private boolean x = false;

    public static void main(String... args) throws IOException {
        Main ob = new Main();
        ListaPersona ob1 = new ListaPersona();
        ListaPersonaDiscapacidad ob2 = new ListaPersonaDiscapacidad();

        do {
            System.out.println("::::::::::MENU::::::::::"
                    + "\n1.Menu personas"
                    + "\n2.Menu personas discapacitadas");
            System.out.print("R= ");
            ob.opcion = Integer.parseInt(ob.bufer());

            switch (ob.opcion) {
                case 1:
                    ob1.menu();
                    break;
                case 2:
                    ob2.menu();
                    break;
            }

        } while (ob.x == false);

    }

    private String bufer() throws IOException {
        String entrada;
        entrada = bufer.readLine();

        return entrada;
    }
}
