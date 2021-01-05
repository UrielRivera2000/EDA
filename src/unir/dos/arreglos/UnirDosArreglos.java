package unir.dos.arreglos;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class UnirDosArreglos {

    /**
     * Unir dos arreglos mediante el metodo merge array
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo a = new Arreglo();
        int primero[]={1,2,3,4,5};
        int segundo[]={6,7,8,9,10};
        int [] union = a.mergeArray(primero, segundo);
        
        for (int i : union) {
            System.out.print(i + " ");
        }
    }
    
}
