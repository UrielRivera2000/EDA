package BusquedaSecuencial.AleatorioVocal;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/*Programa que llena un arreglo con
caracteres aleatorios(10) y que arroje en que
posición se encuentra alguna vocal. Con busqueda secuencial

El main debe tener 7 líneas máximo.*/
public class Principal {
    public static void main(String[] args) {
        char [] arreglo = new Busqueda().llenarArreglo();
        new Busqueda().imprimirArreglo(arreglo);
    }
}
