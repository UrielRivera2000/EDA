package NumeroAleatorios;

// @author Francisco Uriel Guerrero Rivera
/*Obtener numeros aleatorios y guardalos en un arreglo unidimensional de tamaño 10
e imrpimir solo aquellos mayores a 50*/
public class Principal {

    public static void main(String[] args) {
        double[] arreglo = new double[10];

        for (int i = 0; i < arreglo.length; i++) {
            double valorEntero = Math.floor(Math.random() * (100 - 1 + 1) + 1);
            arreglo[i] = valorEntero;
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > 50) {
                System.out.println("Numero mayor a 50: " + arreglo[i]);
            }
        }
    }

}
