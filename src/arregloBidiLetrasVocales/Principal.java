package arregloBidiLetrasVocales;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Programa que imprime en un arreglo bidimesional letras aleatorias
 * e impripre la cantidad de vocales en cada fila
 */
public class Principal {
    public static void main(String[] args) {
        char [][]arregli = new Arreglo().llenarArreglo();
        new Arreglo().imprimirArreglo(arregli);
        new Arreglo().vocalesPorFila(arregli);
    }
}
