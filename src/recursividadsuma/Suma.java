package recursividadsuma;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Suma {
       public int calcularSuma(int n){
        if(n==0){
            return 0;
        }else{
            return n = n+calcularSuma(n-1);
        }
        
        
    }
}
