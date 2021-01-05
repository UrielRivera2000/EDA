package arregloBidiNumerosAleatorios;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Numero {

    public int[][] generarNumeros() {
        int[][] arreglo = new int[4][4];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                double valorEntero = Math.floor(Math.random() * (1000 - 1 + 1) + 1);
                arreglo[i][j] = (int) valorEntero;
            }

        }
        return arreglo;
    }

 

    public int[][] imprimirArreglo(int[][] numeros, int fila, int columna) {
        if (fila == numeros.length -1 && columna == numeros[fila].length  ) {
            return numeros;
        } else {
            if (columna < numeros[fila].length) {
                System.out.print(numeros[fila][columna] + " ");
                return imprimirArreglo2(numeros, fila, columna+1);
            }else{
                System.out.println("");
                return imprimirArreglo2(numeros, fila+1, columna=0);
            }
        }   
    }

    public int[][] imprimirArreglo2(int[][] numeros, int fila, int columna) {
          if (fila == numeros.length -1 && columna == numeros[fila].length ) {
            return numeros;
        } else {
            if (columna < numeros[fila].length) {
                System.out.print(numeros[fila][columna] + " ");
                return imprimirArreglo(numeros, fila, columna+1);
            }else{
                System.out.println("");
                return imprimirArreglo(numeros, fila+1, columna=0);
            }
        } 

        
    }
}
