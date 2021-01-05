package FibonacciRecursividadIndirecta;

import java.util.Scanner;
/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Imprimir la serie de fibonacci con un numero ingresado por el usuario
     * aplicando la recursividad indirecta
     */
    Scanner leer = new Scanner(System.in);
     Pila pila = new Pila();
  public static void main(String[] args) {
        Index ejer = new Index();
        ejer.ejecutar();
    }

    public void ejecutar() {
        
        boolean bandera = false;
        do {
            System.out.println("Ingresa el tamaño de la serie :) :");
            int tamanio = leer.nextInt();
            System.out.println("");
            if (tamanio >= 3) {
                serie2(tamanio);
                pila.print();
            } else {
                System.out.println("Ingresa otro número, ese es negativo");
                bandera = true;
            }
        }while(bandera);
    
    }

    public int[] serie(int tamanio) {
        int num1 = 0;
        int num2 = 1;
        int serie = 1;
        int array[] = new int[tamanio];
        for (int i = 1; i < tamanio; i++) {
            array[i] = serie;
            serie = num1 + num2;
            num1 = num2;
            num2 = serie;
        }
        return array;
    }

    public void serie2(int tamanio) {
        int array[] = serie(tamanio);
        for (int i = array.length - 1; i != 0; i--) {
            pila.push(array[i]);
        }
        pila.push(0);
    
    }
    

}
