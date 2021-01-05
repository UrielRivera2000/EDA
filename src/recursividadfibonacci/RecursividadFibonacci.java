package recursividadfibonacci;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class RecursividadFibonacci {

    /**
     * Calcular la serie de fibonacci a partir de un numero ingresado
     * aplicando la recursividad
     */
    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero tope");
        int numero = leer.nextInt();
        if (numero < 0) {
            System.out.println("No se puede :(");
        } else {
            for (int x = 0; x <= numero; x++) {
                System.out.print(fibo.calcularSerieFibonacci(x) + ", ");
                
            }

        }

    }

}
