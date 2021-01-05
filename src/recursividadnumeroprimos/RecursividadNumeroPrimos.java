
package recursividadnumeroprimos;

/**
*@author Francisco Uriel Guerrero Rivera
*/
public class RecursividadNumeroPrimos {

    /**
     * Calcular el numero primero. aplicando la recursividad. directa
     * 
     */
    public static void main(String[] args) {
        NumeroPrimo num = new NumeroPrimo();
       
        for( int x = 2; x<=29; x++){
            if(num.calcularPrimo(x, 2)){
                 System.out.println(x);
            }else{
                
            }
        }
        
    }
    
}
