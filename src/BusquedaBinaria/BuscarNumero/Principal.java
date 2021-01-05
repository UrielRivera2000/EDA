package BusquedaBinaria.BuscarNumero;

/**
 *
 * @author Familia Gro. Rivera
 */

/*
Programa que lleva a cabo la
búsqueda de un numero dado por el usuario en
un arreglo con 20 elementos aleatorios (con
búsqueda binaria).
 */
public class Principal {

    public static void main(String[] args) {
        double[] arreglo = new Busqueda().generarNumeros();
        Busqueda objeto = new Busqueda();
        new Busqueda().imprimirArreglo(arreglo);
        int numero = new Busqueda().pediPosicion();
        System.out.println("El numero se encuentra el la posicion: " + (int) objeto.busquedaBinaria(numero, arreglo));

    }
}
