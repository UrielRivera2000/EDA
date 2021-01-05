package metodosOrdenamientoJuntos;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class QuickSort {

    public int[] llenarPorQuick() {
        int array[] = new int[5000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil(Math.random() * 100);
        }
        return ordenarPorQuickSort(array, 0, array.length - 1);
    }

    public int[] ordenarPorQuickSort(int arreglo[], int izquierda, int derecha) {

        int pivote = arreglo[izquierda];
        int i = izquierda;
        int j = derecha;
        int aux;
        while (i < j) {
            while (arreglo[i] <= pivote && i < j) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
        }

        arreglo[izquierda] = arreglo[j];
        arreglo[j] = pivote;

        if (izquierda < j - 1) {
            ordenarPorQuickSort(arreglo, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            ordenarPorQuickSort(arreglo, j + 1, derecha);
        }
        return arreglo;
    }

    public void obtenerTiempo(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        long tiempoInicio = System.currentTimeMillis();
        ordenarPorQuickSort(array, 0, array.length - 1);
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("\nTiempo Quick es :" + totalTiempo + " milisegundos");
        System.out.println("\n");

    }
}
