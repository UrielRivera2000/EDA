package arregloBidiTriangulo;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Programa que imprime un triangulo desde un arreglo bidimensional
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int indiceUno = 0, indiceDos = 0, cont = 0;
        String triangulo[][];
        do {
            if (cont >= 1) {
                System.out.println("Error en columna o fila por ser un numeros par o por ser la fila más grande que la columna");
            }
            System.out.println("Ingresa el primer indice (filas) : ");
            indiceUno = leer.nextInt();
            System.out.println("Ingresa el segundo indice (columnas): ");
            indiceDos = leer.nextInt();
            if (indiceUno < 0) {
                indiceUno = indiceUno * -1;

            }
            if (indiceDos < 0) {
                indiceDos = indiceDos * -1;

            }

            triangulo = new String[indiceUno][indiceDos];
            cont++;
        } while (new Triangulo().validarTriangulo(triangulo) == false);
        new Triangulo().imprimirTriangulo(triangulo);
    }

}
