package PaqueteDos;

import PaqueteUno.Persona;
import java.util.Stack;

public class VerLista {

    public void verLista(Stack<Persona> x) {

        if (x.isEmpty()) {
            System.out.println("La lista esta vacia...");
        } else {
            System.out.println("");
            System.out.println("\t\tLISTA PERSONAS");
            for (int i = 0; i < x.size(); i++) {
                System.out.println(x.get(i).toString());
            }
        }
    }
}
