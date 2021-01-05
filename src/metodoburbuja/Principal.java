package metodoburbuja;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Principal {

    /**
     * @Metodo Burbuja
     */
   
    public static void main(String[] args) {
        int array[] = new Burbuja().pedirDatos();
        int ordenado [] = new Burbuja().ordenarAMetodoBurbuja(array);
        for (int i : ordenado) {
            System.out.print(i + " ");
        }
    }
}
