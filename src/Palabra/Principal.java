package Palabra;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 ingrear una palabra y mediante esa palabara solicitar por cada letra de esa palabra
 una nueva palabra. validando que la palabra sea correcta
 todo se manipula en una arreglo unidimensional*/
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String palabra = leer.nextLine();
        Palabra letras = new Palabra();
        Palabra validar = new Palabra();

        palabra = palabra.trim().toLowerCase();
          
        while (validar.validarPalabra(palabra) == false) {

            System.out.println("Ingresa solo una palabra, sin espacios o números o caracteres especiales");
            palabra = leer.nextLine().toLowerCase();
        }

        palabra = palabra.trim().toUpperCase();
        char letras2[] = letras.acomodarPalabra(palabra);
        String palabras[] = new String[palabra.length()];
        int cont = 0;

        do {
            System.out.println("Ingresa una palabra con la letra: " + letras2[cont]);
            String pala = leer.nextLine().toLowerCase();
              while (validar.validarPalabra(pala) == false) {

                 System.out.println("Ingresa solo una palabra, sin espacios o números o caracteres especiales");
                 pala = leer.nextLine().toLowerCase();
             }
            if (letras2[cont] == pala.toUpperCase().charAt(0)) {
                palabras[cont] = pala;
                cont++;
            } else {
                System.out.println("Error, la palabra ingresada no correcta a la letra solicitada");
            }
        } while (cont < palabra.length());

        letras.mostrarPalabras(palabras, letras2);

    }
}
