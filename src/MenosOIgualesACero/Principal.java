
package MenosOIgualesACero;

// @author Francisco Uriel Guerrero Rivera
/*Arreglo unidoemsional estatico, obtenemos los numeros que son iguales a cero
y los que sean menores a cero*/
public class Principal {
    public static void main(String[] args) {
        int []arreglo = {1,0,60,-3,0,5,-5,12,23,-8,-1,0};
        Calculo calculo = new Calculo();
        Calculo calculo2 = new Calculo();
        
        calculo.obtenerNumeroIgualACero(arreglo);
        System.out.println("");
        calculo2.obtenerNumeroMenorACero(arreglo);
        
        
       
    }
}
