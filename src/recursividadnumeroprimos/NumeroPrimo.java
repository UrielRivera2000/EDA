
package recursividadnumeroprimos;

public class NumeroPrimo {
   public  boolean calcularPrimo(int numero, int divisor){
        if(numero/2 < divisor){
            return true;
        } else {
            if(numero%divisor==0){
                return false;
            } else {
                return calcularPrimo(numero, divisor+1);
            }
        }
    }
}
