package BusquedaBinaria.BuscarNumero;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Busqueda {

    public double busquedaBinaria(int clave, double[] arreglo) {
        int pos = -1;
        arreglo = bubbleSort(arreglo);
        int medio = arreglo.length / 2;
        double elemento = arreglo[medio];
        if (clave > elemento) {
            for (int i = medio; i < arreglo.length; i++) {
                if (clave == arreglo[i]) {
                    pos = i;
                    break;
                }
            }
        } else {
            if (clave < elemento) {
                for (int i = 0; i < medio; i++) {
                    if (clave == arreglo[i]) {
                        pos = i;
                        break;
                    }
                }
            } else {
                pos = medio;
            }
        }
        return pos;
    }

    double[] bubbleSort(double[] arreglo) {
        double aux;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        return arreglo;
    }

    public double[] generarNumeros() {
        double[] arreglo = new double[20];
        for (int i = 0; i < arreglo.length; i++) {
            double valorEntero = Math.floor(Math.random() * (10 - 1 + 1) + 1);
            arreglo[i] = valorEntero;
        }
        return arreglo;
    }

    public void imprimirArreglo(double arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {

            System.out.print(arreglo[i] + "  ");
        }
        System.out.println("");
    }

    public int pediPosicion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero que quieres buscar: ");
        int numero = leer.nextInt();

        return numero;
    }
}
