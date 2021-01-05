
package PalabraRecursividad;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Palabra {

    public String pedirPalabra() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra , por favor:");
        palabra = leer.next();
        return palabra;
    }

    public char[] arreglo(String palabra, int indice,  char array[]) {
        

        if (indice == array.length) {
            return array;
        } 
            if (indice < array.length) {
                array[indice] = palabra.charAt(indice);
               return arreglo(palabra, indice + 1, array);
            
        }
            
          
        return array;
    }

    public void imprimirArreglo(char palabra[], int indice) {

        if (indice < palabra.length) {
            System.out.print(palabra[indice] + " -- ");
            imprimirArreglo(palabra, indice + 1);
        }

    }

}
