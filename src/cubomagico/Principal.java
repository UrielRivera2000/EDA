package cubomagico;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Principal {

    /**
     * Cubo mágico (3X3) debe solicitar las coordenadas para tirar y decir el
     * numero que va a colocar (1-9) sin que se repitan. En cada tirada se debe
     * imprimir "el tablero" Debe validar (la suma de 15) en los verticales ,
     * horizontales y diagonales , si se equivoca y no da la suma en alguna de
     * sus hileras debe decir perdiste en caso contrario ganaste
     */
    public static void main(String[] args) {
        List<Integer> lista = new CuboMagico().llenarLista();
        Scanner leer = new Scanner(System.in);
        new CuboMagico().imprimirLista(lista);
        int numero = 0, PG1 = 0, PG2 = 0, PG3 = 0, resultado = 0;

        do {
            System.out.println("");
            System.out.println("Cual quieres numero ingresarás?");
            System.out.println("Solo se puede del 1-9");
            try {
                numero = leer.nextInt();
                if (numero >= 0 && numero <= 9) {

                    lista = new CuboMagico().elegirEspacio(lista, numero);
                    new CuboMagico().imprimirLista(lista);
                    PG1 = new CuboMagico().validarSumaHorizontal(lista);
                    PG2 = new CuboMagico().validarSumaVertical(lista);
                    PG3 = new CuboMagico().validarSumaDiagonal(lista);
                    if (PG1 == 3 && PG2 == 3 && PG3 == 3) {
                        System.out.println("");
                        System.out.println("Ganaste!!");
                        resultado = 3;
                    } else {
                        if (PG1 == 2 || PG2 == 2 || PG3 == 2) {
                            System.out.println("");
                            System.out.println("Perdiste!!");
                            resultado = 2;
                        } else {
                            if (PG1 == 4 || PG2 == 4 || PG3 == 4) {
                                System.out.println("");
                                System.out.println("Lo siento si sigues aun así la suma no dará :(");
                            } else {
                                resultado = 0;
                            }

                        }

                    }
                } else {
                    System.out.println("Numero fuera del rango");
                }
            } catch (Exception e) {
                System.out.println("Erro al ingresar caracter: " + e);
                break;
            }

        } while (resultado == 0);

    }

}
