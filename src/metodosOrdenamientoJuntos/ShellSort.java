
package metodosOrdenamientoJuntos;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class ShellSort {

    public int[] ordenamientoShell() {
        int[] array = new int[5000];
        int salto, aux, i;
        boolean cambios;

        for (int j = 0; j < array.length; j++) {
            array[j] = (int) Math.ceil(Math.random() * 100);
        }

        for (salto = array.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < array.length; i++) // se da una pasada
                {
                    if (array[i - salto] > array[i]) {       // y si están desordenados
                        aux = array[i];                  // se reordenan
                        array[i] = array[i - salto];
                        array[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }

        return array;

    }

    
    public void obtenerTiempo(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        long tiempoInicio = System.currentTimeMillis();
        ordenamientoShell();
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("\nTiempo Shell:" + totalTiempo + " milisegundos");
       System.out.println("\n");

    }
}
