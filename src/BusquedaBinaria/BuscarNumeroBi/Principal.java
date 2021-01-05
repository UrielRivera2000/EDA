package BusquedaBinaria.BuscarNumeroBi;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/** 
 * Adecuaciones dentro del método de
búsqueda binaria para que se puedan realizar
búsquedas en arreglos bidimensionales.
*/

public class Principal {
    public static void main(String[] args) {
        int [][] arreglo = new BusquedaBidimensional().generarNumeros();
        new BusquedaBidimensional().imprimirArreglo(arreglo);
        new BusquedaBidimensional().bubbleSort(arreglo);
        System.out.println("");
        new BusquedaBidimensional().imprimirArreglo(arreglo);
        int clave = new BusquedaBidimensional().pedirNumero();
        int [] pos = new BusquedaBidimensional().busquedaBinaria(clave, arreglo);
        System.out.println("Tu numero está en la posicion: ("+ pos[0] +", "+ pos[1]+")");
                
    }
}
