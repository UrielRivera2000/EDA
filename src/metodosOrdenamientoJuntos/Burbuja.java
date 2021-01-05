package metodosOrdenamientoJuntos;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Burbuja {

    public int[] ordenamiento() {
        Scanner leer = new Scanner(System.in);
        int[] array = new int[5000];
        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil(Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (!(array[i] > array[j + 1])) {
                    aux = array[i];
                    array[i] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }

    public void imprimirTiempo(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        long tiempoInicio = System.currentTimeMillis();
        ordenamiento();
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("\nTiempo Burbuja:" + totalTiempo + " miliseg");
        System.out.println("\n");

    }
    
}
