
package metodoburbuja;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Burbuja {
    public int [] pedirDatos(){
        Scanner leer = new Scanner(System.in);
        int [] array = new int [10];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresa el valor " + (i+1));
            array[i] = leer.nextInt();
        }
        
        return array;
    }
    
    public int [] ordenarAMetodoBurbuja(int array[]){
        int aux=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length-1; j++) {
                if (!(array[i] > array[j+1])) {
                    aux = array[i];
                    array[i] = array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        return array;
    }
}
