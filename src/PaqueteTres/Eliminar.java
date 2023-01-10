
package PaqueteTres;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import PaqueteUno.PersonaDiscapacidad;
import java.util.Stack;

public class Eliminar {
    private BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    private ListaPersonaDiscapacidad ob2 = new ListaPersonaDiscapacidad();
    
    private int n;
    
    public void eliminar(Stack<PersonaDiscapacidad> x) throws IOException{
        System.out.println("");
        System.out.println("DIGITA EL INDICE CORRESPONDIENTE PARA ELIMINARLO");
        for(int i = 0; i < x.size(); i++){
            System.out.println(i + " " + x.get(i).getNombre());
        }
        System.out.print("Digite el indice que deceas eliminar : ");
        n = Integer.parseInt(bufer());
        
        x.remove(n);
        ob2.setLista(x);
        
    }
    
    private String bufer() throws IOException{
        String entrada;
        entrada = bufer.readLine();
        
        return entrada;
    }
}
