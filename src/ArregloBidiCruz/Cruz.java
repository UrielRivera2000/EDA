package ArregloBidiCruz;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
import java.util.Scanner;

public class Cruz {

    public boolean validarCruz(String[][] cruz) {

        int columna, fila;
        fila = (int) (cruz.length / 2);
        columna = (int) (cruz[0].length / 2);
        if (cruz.length % 2 == 0) {
            return false;
        } else {
            if (cruz[0].length % 2 == 0) {
                return false;
            } else {
                for (int i = 0; i < cruz.length; i++) { // fila 
                    for (int j = 0; j < cruz[i].length; j++) { // columna
                        if (i == fila) {
                            cruz[i][j] = " + ";

                        } else {
                            if (j == columna) {
                                cruz[i][j] = " + ";
                            } else {
                                cruz[i][j] = "   ";
                            }

                        }
                    }
                }
                return true;
            }

        }

    }

    public void imprimirArreglo(String[][] cruz) {
        for (int i = 0; i < cruz.length; i++) { //fila
            for (int j = 0; j < cruz[i].length; j++) { //columna
                System.out.print(cruz[i][j]);
            }
            System.out.println("");
        }
    }
}
