package BusquedaBinaria.arreglosBidimensionales;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/** Programa que busca un numero
dado por el usuario en un arreglo bidimensional
de 4x4 llenado dinámicamente con números del
1-30.
*/
public class Principal {
    public static void main(String[] args) {
         int [][] arreglo2 = new BusquedaBidimensional2().generarNumeros();
        new BusquedaBidimensional2().imprimirArreglo(arreglo2);
        new BusquedaBidimensional2().bubbleSort(arreglo2);
        System.out.println("");
        new BusquedaBidimensional2().imprimirArreglo(arreglo2);
        int clave2 = new BusquedaBidimensional2().pedirNumero();
        int [] posi = new BusquedaBidimensional2().busquedaBinaria(clave2, arreglo2);
        System.out.println("Tu numero está en la posicion: ("+ posi[0] +", "+ posi[1]+")");
    }
}
