package BusquedaSecuencial.ElementoMenor;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/*Programa que hace la búsqueda
del elemento menor de 10 números dados por el
usuario, en la salida se deberá ver cual es el
numero y su posición.
Con busqueda secuencial*/

public class Principal {
    public static void main(String[] args) {    
      double [] arreglo = new BusquedaElemento().llenarArreglo();
      new BusquedaElemento().busquedaSecuencialMenor(arreglo);
      
    }
}
