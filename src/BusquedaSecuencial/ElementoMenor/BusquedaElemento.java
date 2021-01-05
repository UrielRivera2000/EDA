package BusquedaSecuencial.ElementoMenor;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class BusquedaElemento {

    public double[] llenarArreglo() {
        double arreglo[] = new double[10];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresa el número: ");
            try {
                arreglo[i] = leer.nextDouble();
            } catch (Exception e) {
                System.out.println("Error, ingresaste una cadena: " + e);
            }
        }

        return arreglo;
    }

    public void busquedaSecuencialMenor(double[] arreglo) {
        int pos = -1;
        double valor = Double.MAX_VALUE; // Double.MIN_VALUE;
        double numeroMenor = 0.0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < valor) {
                pos = i;
                numeroMenor = arreglo[i];
                valor = arreglo[i];
            }
        }
        System.out.println("El menor es: " + numeroMenor + " y está en la posicion: " + pos + " del arreglo");
    }

}
