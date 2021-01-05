package metodoshellsort;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class ShellSort {

    public int[] llenarPorShell() {
        int[] array = new int[30];
        int salto, aux, i;
        boolean cambios;

        for (int j = 0; j < array.length; j++) {
            array[j] = (int) Math.ceil(Math.random() * 50);
        }

        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = salto; i < array.length; i++) {
                    if (array[i - salto] > array[i]) {
                        aux = array[i];
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        return imprimirShell(array);
    }

    public int[] imprimirShell(int sort[]) {
        for (int i : sort) {
            System.out.print(i + " ");
        }
        return sort;
    }

    public void imprimirTiempo(int array[]) {
        long tiempoInicio = System.currentTimeMillis();
        llenarPorShell();
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("Tiempo:" + totalTiempo + " milisegundos");

    }

}
