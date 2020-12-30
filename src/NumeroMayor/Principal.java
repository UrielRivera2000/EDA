
package NumeroMayor;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 calcular numero mayor y suma de numeros.
 Con recursividad directa, mediante un arreglo unidimensional de tamaño 10*/
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leer =  new Scanner (System.in);
        double [] arreglo  = new double [10];
        NumeroMayor num = new NumeroMayor();
        int contador = 9;
        double suma =0.0, mayor = 0.0;
        
           try{
             for (int i = 0; i < 10; i++) {
                System.out.println("Ingresa el numero : "+ (i+1));
                arreglo[i] = leer.nextDouble();
                    }
             }catch(Exception e){
                 System.out.println("No se pueden ingresar cadenas : "+ e);
             }
        
        
         double [] respuesta = num.cacularMayorYSuma(arreglo, contador, suma, mayor);
           
         System.out.println("Suma de los elementos: "+respuesta[0]);
         System.out.println("Numero mayor: "+respuesta[1]);
    }
}
