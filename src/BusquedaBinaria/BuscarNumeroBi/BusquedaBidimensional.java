package BusquedaBinaria.BuscarNumeroBi;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class BusquedaBidimensional {

    public int pedirNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Que numero quieres busacar?, están del 1-20");
        int numero = leer.nextInt();

        return numero;
    }

    public int[] busquedaBinaria(int clave, int[][] arreglo) {
        int pos = -1; // filas
        int pos2 = -1; // columnas
        arreglo = bubbleSort(arreglo);
        int medio = arreglo.length / 2; // filas
        int medio2 = arreglo[0].length / 2; // columnas

        System.out.println("fila: " + medio);
        System.out.println("columna: " + medio2);
        int elemento = arreglo[medio][medio2]; // filas //columnas
        int cont = 0;
        if (clave > elemento) {
            for (int i = medio; i < arreglo.length; i++) {
                if (cont == 0) {
                    for (int j = medio2; j < arreglo[i].length; j++) {

                        if (clave == arreglo[i][j]) {
                            pos = i; // fila
                            pos2 = j; // columna
                            break;
                        }
                    }

                } else {
                    for (int x = 0; x < arreglo[i].length; x++) {
                        if (pos != -1 && pos2 != -1) {
                            if (arreglo[pos][pos2] == clave) {
                                break;
                            }
                        } else {
                            if (clave == arreglo[i][x]) {
                                pos = i; // fila
                                pos2 = x; // columna
                                break;
                            }
                        }

                    }
                }
                cont++;
            }
        } else {
            if (clave < elemento) {
                for (int i = 0; i < medio /*filas*/; i++) {
                    for (int j = 0; j < arreglo[i].length /*columnas*/; j++) {
                        if (clave == arreglo[i][j]) {
                            pos = i; // fila
                            pos2 = j; // columna
                            break;
                        }
                    }

                }
            } else {
                pos = medio; // filas
                pos2 = medio2; // columnas
            }
        }
        int arr[] = {pos, pos2};
        return arr;
    }

    int[][] bubbleSort(int[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                for (int k = 0; k < arreglo.length; k++) {
                    for (int l = 0; l < arreglo[k].length; l++) {
                        if (arreglo[i][j] >= arreglo[k][l]) {
                            arreglo[i][j] = arreglo[i][j];
                        } else {
                            int temp = arreglo[k][l];
                            arreglo[k][l] = arreglo[i][j];
                            arreglo[i][j] = temp;
                        }
                    }
                }
            }
        }

        return arreglo;
    }

    public int[][] generarNumeros() {
        int[][] arreglo = new int[3][5];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                double valorEntero = Math.floor(Math.random() * (20 - 1 + 1) + 1);
                arreglo[i][j] = (int) valorEntero;
            }

        }
        return arreglo;
    }

    public void imprimirArreglo(int[][] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("");

        }

    }
}
