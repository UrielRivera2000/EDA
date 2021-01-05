package ArregloBidiCruz;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera 
 * Programa que recibe dos índices
 * (dados por el usuario) posteriormente imprime un arreglo bidimensional con
 * una cruz en el centro.
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int indiceUno = 0, indiceDos = 0, cont = 0;
        String cruz[][];
        do {
            if (cont >= 1) {
                System.out.println("Error en columna o fila por ser un numeros par. no tendrá centro");
            }
            System.out.println("Ingresa el primer indice : ");
            indiceUno = leer.nextInt();
            System.out.println("Ingresa el segundo indice : ");
            indiceDos = leer.nextInt();
            if (indiceUno < 0) {
                indiceUno = indiceUno * -1;

            }
            if (indiceDos < 0) {
                indiceDos = indiceDos * -1;

            }

            cruz = new String[indiceUno][indiceDos];
            cont++;
        } while (new Cruz().validarCruz(cruz) == false);
        new Cruz().imprimirArreglo(cruz);
    }
}
