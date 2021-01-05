package arregloBidiLetrasDiagonal;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Programa que llena un arreglo bidimensional de letras aleatorias
 * y además traza una diagonal
 */
public class Principal {
    public static void main(String[] args) {
        char [][]arregli = new Arreglo().llenarArreglo();
        new Arreglo().imprimirArreglo(arregli);
        System.out.println("");
        char [][] arr = new Arreglo().generarDiagonal(arregli);
        new Arreglo().imprimirArregloOrdenado(arr);
    }
}
