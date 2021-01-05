package arregloBidiTriangulo;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Triangulo {

    public boolean validarTriangulo(String[][] cruz) {
        int columna1 = cruz.length;
        int columna, fila;
        columna = (int) (cruz.length / 2);
        fila = (int) (cruz[0].length / 2);
        if (cruz.length % 2 == 0) {
            return false;
        } else {
            if (cruz[0].length % 2 == 0) {
                return false;
            } else {
                if (fila < columna) {
                    return false;
                }
            }
            return true;
        }

    }

    public void imprimirTriangulo(String triangulo[][]) {
        int mitad = triangulo[0].length / 2;
        for (int i = 0; i < triangulo.length; i++) { //filas
            for (int j = 0; j < triangulo[0].length; j++) {
                if ((i + j) >= mitad && (j - i) <= mitad) { //columna
                    triangulo[i][j] = "*";
                } else {
                    triangulo[i][j] = " ";
                }
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
