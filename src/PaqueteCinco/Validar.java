
package PaqueteCinco;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validar {
   
    public boolean validar(String x){
        Pattern pat = Pattern.compile("[a-zA-z]{1,20}");
        Matcher mat = pat.matcher(x);
        if(mat.matches()){
           return true;
        }else{
           return false;
        }
    }
    
}
