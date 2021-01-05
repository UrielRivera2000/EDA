package arregloBidiLetrasVocales;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Arreglo {

    public char[][] llenarArreglo() {
        char letras[][] = new char[5][5];

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

    public void vocalesPorFila(char[][] letras) {
        for (int i = 0; i < letras.length; i++) {
            int cont = 0;
            for (int j = 0; j < letras[i].length; j++) {
                if (letras[i][j] == 'a' || letras[i][j] == 'e' || letras[i][j] == 'i' || letras[i][j] == 'o' || letras[i][j] == 'u') {
                    cont++;
                }
            }
            System.out.println("vocale fila: " + i + " cantidad: " + cont);
        }
    }
}
