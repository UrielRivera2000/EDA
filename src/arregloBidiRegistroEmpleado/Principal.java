package arregloBidiRegistroEmpleado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
/*
Programa que guarda en un arreglo
bidimensional de 3 x 2 el registro de un empleado
y el registro de su jefe directo, los datos de un
empleado son: nombre completo, nombre del
depto. y sueldo base, e imprime dicho arreglo.*/
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Empleado empleado[][] = new Empleado[1][2];
        for (int i = 0; i < empleado.length; i++) {
            for (int j = 0; j < empleado[i].length; j++) {
                Empleado empleado1 = new Empleado();
                if (j == 0) {
                    System.out.println("Ingresa el nombre completo del empleado: ");
                    empleado1.setNombreCmpleto(leer.nextLine());
                    System.out.println("Ingresa el nombre del dpto del empleado: ");
                    empleado1.setNombreDpto(leer.nextLine());
                    System.out.println("ingresa el sueldo base del empleado: ");
                    empleado1.setSueldoBase(leer.nextDouble());
                    empleado[i][j] = empleado1;
                    leer.skip("\n");
                } else {
                    System.out.println("Ingresa el nombre completo del jefe: ");
                    empleado1.setNombreCmpleto(leer.nextLine());
                    System.out.println("Ingresa el nombre del dpto del jefe: ");
                    empleado1.setNombreDpto(leer.nextLine());
                    System.out.println("ingresa el sueldo base del jefe: ");
                    empleado1.setSueldoBase(leer.nextDouble());
                    empleado[i][j] = empleado1;
                    leer.skip("\n");
                }

            }
        }
        new EmpleadoDao().mostrarRegistros(empleado);

    }
}
