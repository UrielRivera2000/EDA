package metodosOrdenamientoJuntos;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Principal {

    /**
     * @Metodos
     * Merge sort
     * Shell sort
     * quick sort
     * burbuja
     */
   
    public static void main(String[] args) {
        int [] marge = new MargeSort().llenarArray();
        new MargeSort().obtenerElTiempo(marge);
          
        int[] shell = new ShellSort().ordenamientoShell();
        new ShellSort().obtenerTiempo(shell);
        
        int[] quick = new QuickSort().llenarPorQuick();
        new QuickSort().obtenerTiempo(quick);
          
        int[] burbuja = new Burbuja().ordenamiento();
        new Burbuja().imprimirTiempo(burbuja);
        
       
    }
}
