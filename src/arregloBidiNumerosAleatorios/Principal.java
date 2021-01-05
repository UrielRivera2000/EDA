
package arregloBidiNumerosAleatorios;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * 
 * Programa que imprime en un arreglo bidimensional 
 * numeros aleatorios y los imprime
 */
public class Principal {
    public static void main(String[] args) {
        int  filas = 0, columnas = 0;
        int [][] numeros = new Numero().generarNumeros();
        new Numero().imprimirArreglo(numeros,filas,columnas);
    }
}
