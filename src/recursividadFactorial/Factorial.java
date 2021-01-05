
package recursividadFactorial;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Factorial {
    public int calcularFactorial(int n){
        if(n==0){
            return 1;
        }else{
            return n = n*calcularFactorial(n-1);
        }
        
        
    }
}
