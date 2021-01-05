package unir.dos.arreglos;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Arreglo {
    public int [] mergeArray(int []a, int[]b){
        int union[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
           union[i] = a[i];
        }
        int c = 0;
        for (int i = a.length; i < union.length; i++) {
            union[i] = b[c];//union[i] = b[i - a.length];
            c++;
        }
        return union;
    }
}
