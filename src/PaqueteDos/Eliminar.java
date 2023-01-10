package PaqueteDos;

import PaqueteUno.Persona;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eliminar {

    private BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    private ListaPersona ob1 = new ListaPersona();
    
    private int n;
    
    public void eliminar(Stack<Persona> x) throws IOException {
        System.out.println("");
        System.out.println("\t\tDIGITA EL INDICE CORRESPONDIENTE PARA ELIMINARLO");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + " " + x.get(i).getNombre());
        }
        System.out.print("Digita el incide que deceas eliminar : ");
        n = Integer.parseInt(bufer());
        
        
        x.remove(n);
        
        ob1.setLista(x);
        
    }

    private String bufer() throws IOException {
        String entrada;
        entrada = bufer.readLine();

        return entrada;
    }

}
