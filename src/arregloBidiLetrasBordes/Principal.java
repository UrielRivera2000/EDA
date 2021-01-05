package arregloBidiLetrasBordes;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

/*
Programa que guarda en un arreglo
bidimensional de 5 x 5 caracteres aleatorios
(letras) y lo imprima, después reemplazar los
caracteres de los bordes con un ‘-’, e imprime el
resultado.*/
public class Principal {

    public static void main(String[] args) {
        char[][] letras = new Letra().llenarArreglo();
        new Letra().imprimirArreglo(letras);
        new Letra().generarMargen(letras);
        System.out.println("");
        new Letra().imprimirArregloOrdenado(letras);

    }

}
