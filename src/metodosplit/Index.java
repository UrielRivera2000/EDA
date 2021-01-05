
package metodosplit;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Metodo split
     * 
     * 
     */
    public static void main(String[] args) {
     /*  String palabra = "es-ta es una prueba";
       String[] division = palabra.split(" ");
       String []div2 = division[0].split("-");
       String [] div3 = division[3].split("-");
        for (String string : division) {
            System.out.println(string);
        }
        System.out.println("------------");
        for (String string : div2) {
            System.out.println(string);
        }*/
     Arreglo a = new Arreglo();
     int [] numeros = {0,10,3,0,-5,2,1,0,9,6,0,12,5,0};
     int [] division = a.split(numeros,0);
        for (int i : division) {
            System.out.println(i);
        }
    }
    
}
