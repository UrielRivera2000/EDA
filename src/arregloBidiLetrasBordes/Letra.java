package arregloBidiLetrasBordes;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Letra {

    public char[][] llenarArreglo() {
        char letras[][] = new char[7][7];

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

    public char[][] generarMargen(char[][] letras) {
        int cont = letras.length;
        for (int i = 0; i < letras.length; i++) { //Columnas

            for (int j = 0; j < letras[i].length; j++) { //Filas
                if (j == 0) {
                    letras[i][j] = '-';
                }
                if (j == (letras[i].length - 1)) {
                    letras[i][j] = '-';
                }
                if (i == 0) {
                    letras[i][j] = '-';
                }
                if (i == (letras.length - 1)) {
                    letras[i][j] = '-';
                }
            }
        }
        return letras;
    }

    public void imprimirArregloOrdenado(char[][] letras) {
        for (int i = 0; i < letras.length; i++) {   //Filas
            for (int j = 0; j < letras[i].length; j++) { //Columnas

                System.out.print(letras[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
