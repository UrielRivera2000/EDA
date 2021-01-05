package batallanaval;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Principal {

    /**
     * Realiza un programa donde se simule una especie de "batalla naval" en
     * consola usando arreglos (5x5).
     *
     * Se colocaran 5 asteriscos (*) que serán como las naves, en posiciones
     * RANDOM dentro del tablero (arreglo). Debe pedir al usuario las
     * coordenadas que quiere destapar si no tiene * sustituirá el espacio en
     * blanco por una A y posteriormente imprimir el arreglo. Si
     * encuentra una nave debe sustituirla por una H e imprimir arreglo.
     * Al hundir las 5 naves gana y debe mostrar un mensaje
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        char[][] arreglo = new Batalla().llenarArregloInicial();
        new Batalla().imprimirArreglo(arreglo);
        char arregloU[][] = new char[5][5];
        int encuentroNaves = 0;
        do {
            System.out.println("Escoge tu cordenada");
            System.out.println("Elije la fila");
            int fila = leer.nextInt();
            System.out.println("Elije la columna");
            int columna = leer.nextInt();
            char arregloUsuario[][] = new Batalla().elegirCoordenada(arreglo, fila, columna, arregloU);
            System.out.println("");
            encuentroNaves = new Batalla().validarEncuentroNave(arregloUsuario);
            new Batalla().imprimirArreglo(arregloUsuario);
        } while (encuentroNaves < 5);
        System.out.println("¡Encontraste todas las naves, enseñame! :3");

    }

}
