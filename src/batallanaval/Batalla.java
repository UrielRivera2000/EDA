package batallanaval;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Batalla {

    public char[][] llenarArregloInicial() {
        char[][] arreglo = new char[5][5];
        int cont = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                int numero = (int) Math.floor(Math.random() * (0 - 10) + 10);
                if (numero > 1 && cont < 5) {
                    int codigoAscii = (int) Math.floor(Math.random() * (42 - 42) + 42);
                    arreglo[i][j] = (char) codigoAscii;
                    cont++;
                } else {
                    int codigoAscii2 = (int) Math.floor(Math.random() * (127 - 127) + 127);
                    arreglo[i][j] = (char) codigoAscii2;
                }

            }
        }
        return arreglo;
    }

    public void imprimirArreglo(char[][] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public char[][] elegirCoordenada(char[][] arreglo, int fila, int columna, char[][] arregloUsuario) {
        if (fila >= arreglo.length || columna >= arreglo[0].length || fila < 0 || columna < 0) {
            System.out.println("Error en cordenadas, están fuera de las dimensiones del tablero");
        } else {
            if (arreglo[fila][columna] == '*') {

                arreglo[fila][columna] = 'H';
                arregloUsuario[fila][columna] = 'H';
            } else {
                if (arreglo[fila][columna] != '*') {
                    if (arreglo[fila][columna] == 'H') {

                    } else {
                        arreglo[fila][columna] = 'A';
                        arregloUsuario[fila][columna] = 'A';
                    }

                }

            }
        }
        return arregloUsuario;
    }

    public int validarEncuentroNave(char arreglo[][]) {
        int cont = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] == 'H') {
                    cont++;
                }
            }
        }
        return cont;
    }

}
