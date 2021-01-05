package BusquedaBinaria.nombres;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/**Programa que lleva a cabo la
búsqueda de un nombre (dado por el usuario)
dentro de un arreglo de 20 nombres (estáticos)
el programa tiene que mostrar en un mensaje
con el índice donde se encuentra.
*/
public class Principal {

    public static void main(String[] args) {
        String nom = new BusquedaNombre().ingresarNombre();
        String[] arreglo = new BusquedaNombre().llenarArreglo();
        new BusquedaNombre().imprimirPosicion(nom , arreglo);

    }
}
