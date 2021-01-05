package recursividadparimpar;

import java.util.Scanner;

/*Francisico Uriel Guerrero Rivera

Saber si un numero es par o impar, aplicando la recursividad*/
public class RecursividadParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ParImpar n = new ParImpar();
        int num = 0;

        System.out.println("Ingresa el numero");
        num = leer.nextInt();
        if (num <= 0) {

            num = num * -1;
        }
        if (n.calcularPar(num)) {
            System.out.println("El numero es par");

        } else if (n.calcularPar(num) == false) {
            System.out.println("El numero es impar");
        }
    }

}
