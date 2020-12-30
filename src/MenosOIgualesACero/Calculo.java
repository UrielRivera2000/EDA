
package MenosOIgualesACero;

// @author Francisco Uriel Guerrero Rivera
 
public class Calculo {

    public void obtenerNumeroMenorACero(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < 0) {
                System.out.println("Numero menor a 0: " + arreglo[i] + " en la posición: " + i);
            }
        }

    }

    public void obtenerNumeroIgualACero(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo [i] == 0){
                 System.out.println("Numero igual a 0: " + arreglo[i] + " en la posición: " + i);
            }
           
        }
    }
}
