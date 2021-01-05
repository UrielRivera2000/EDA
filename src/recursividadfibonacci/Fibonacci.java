package recursividadfibonacci;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Fibonacci {
    public int calcularSerieFibonacci(int numero){
        if(numero==0){
            return 0;
        }else{
            if(numero <= 2){
                return 1;
            }
            int serie = calcularSerieFibonacci(numero-1) + calcularSerieFibonacci(numero-2);
            return serie;
        }
        
    }
}
