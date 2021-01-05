package BusquedaSecuencial.AleatorioVocal;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Busqueda {

    public char[] llenarArreglo() {
        char letras[] = new char[10];

        for (int i = 0; i < letras.length; i++) {

            int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
            letras[i] = (char) codigoAscii;

        }
        return letras;
    }

    public void imprimirArreglo(char[] letras) {
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        String pos = " ";
        String vocal = "";
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
            for (int j = 0; j < vocales.length; j++) {
                if (letras[i] == vocales[j]) {
                    pos = pos + i+"  ";
                }

            }

        }
        System.out.println("\n Vocales en las posicion(es): " + pos);

    }
}
