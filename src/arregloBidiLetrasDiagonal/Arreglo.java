package arregloBidiLetrasDiagonal;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Arreglo {

    public char[][] llenarArreglo() {
        char letras[][] = new char[10][10];

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {

                int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
                letras[i][j] = (char) codigoAscii;

            }
        }
        return letras;
    }

    public void imprimirArreglo(char[][] letras) {
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {

                System.out.print(letras[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public char[][] generarDiagonal(char[][] letras) {

        for (int i = 0; i < letras.length; i++) { //fila
            for (int j = 0; j < letras[i].length; j++) { //columna

                if (i == j) {
                    letras[i][j] = '-';
                }
            }
        }
        return letras;
    }

    public void imprimirArregloOrdenado(char[][] letras) {
        for (int i = 0; i < letras.length; i++) { //fila
            for (int j = 0; j < letras[i].length; j++) { //columna

                System.out.print(letras[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
