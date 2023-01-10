
package PaqueteTres;
import PaqueteUno.PersonaDiscapacidad;
import java.util.Stack;

public class VerLista {
    
    public void verLista(Stack<PersonaDiscapacidad> x ){
        System.out.println("");
        System.out.println("\t\tLISTA PERSONAS DISCAPACIDAD");
        for(int i = 0; i < x.size(); i++){
            System.out.println(x.get(i).toString());
        }
    }
    
    
}
