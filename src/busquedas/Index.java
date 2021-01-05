package busquedas;
/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Metodos de busqueda secuencial y busqueda binaria
     * Nota: la busqueda binaria necesita del metodo burbuja
     */
    public static void main(String[] args) {
       Arreglos a=new Arreglos();
       int []numeros={1,9,8,5,0,6,-1};
        System.out.println("Tu numero se encuentra en la posición:"+
                a.busquedaSecuencial(10, numeros));
        System.out.println("------------------");
        System.out.println("Tu numero se encuentra en la posición:"+
                a.busquedaBinaria(6, numeros));
        }
    }
    
