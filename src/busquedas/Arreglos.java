package busquedas;

public class Arreglos {

    public int busquedaSecuencial(int clave, int[] arreglo) {
        int pos = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == clave) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public int busquedaBinaria(int clave, int[] arreglo) {
        int pos = -1;
        arreglo = bubbleSort(arreglo);
        int medio = arreglo.length / 2;
        int elemento = arreglo[medio];
        if (clave > elemento) {
            for (int i = medio; i < arreglo.length; i++) {
                if (clave == arreglo[i]) {
                    pos = i;
                    break;
                }
            }
        } else {
            if (clave < elemento) {
                for (int i = 0; i < medio; i++) {
                    if (clave == arreglo[i]) {
                        pos = i;
                        break;
                    }
                }
            } else {
                pos = medio;
            }
        }
        return pos;
    }

    int[] bubbleSort(int[] arreglo) {
        int aux;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }

        return arreglo;
    }
}
