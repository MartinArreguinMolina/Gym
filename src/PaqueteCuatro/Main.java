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
    private boolean x1 = false;

    public static void main(String... args) throws IOException {
        Main ob = new Main();
        ListaPersona ob1 = new ListaPersona();
        ListaPersonaDiscapacidad ob2 = new ListaPersonaDiscapacidad();

        do {
            do {
                System.out.println("");
                System.out.println("::::::::::MENU::::::::::"
                        + "\n1.Menu personas"
                        + "\n2.Menu personas discapacitadas");
                System.out.print("R= ");
                do {
                    try {
                        ob.opcion = Integer.parseInt(ob.bufer());
                    } catch (NumberFormatException e) {
                        System.out.println("Debes de digitar un numero...");
                        ob.x1 = false;
                    }

                } while (ob.x1 == false);

            } while (ob.opcion < 1 || ob.opcion > 2);

            switch (ob.opcion) {
                case 1:
                    ob1.menu();
                    break;
                case 2:
                    ob2.menu();
                    break;
            }

        } while (ob.x == false);
        System.out.println("");
    }

    private String bufer() throws IOException {
        String entrada;
        entrada = bufer.readLine();

        return entrada;
    }
}
