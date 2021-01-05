package metodmargesort;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Prinicipal {

    /**
     * Metodo de ordenamiento merge sort
     */
    
    public static void main(String[] args) {
        int[] array = new Marge().llenarArray();
        new Marge().sort(array, 0, array.length - 1);
        new Marge().obtenerTiempo(array);
    }

}
