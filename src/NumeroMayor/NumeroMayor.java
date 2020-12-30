package NumeroMayor;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class NumeroMayor {

    public double[] cacularMayorYSuma(double[] arreglo, int contador, double suma, double mayor) {
        suma = suma + arreglo[contador];
        if (arreglo[contador] > mayor) {

            mayor = arreglo[contador];
        }
        if (contador == 0) {
            double respuesta[] = {suma, mayor};
            return respuesta;
        }
        if (contador < arreglo.length) {
            return cacularMayorYSuma(arreglo, contador - 1, suma, mayor);
        }

        double arr[] = {0.0, 0.0};
        return arr;
    }
}
