package recursividadpotencia;

import java.util.Scanner;

/*
Francisco Uriel Guerrero Rivera


Obtener de un numero ingresado su potencia.
Usando la recursividad
*/
public class RecursividadPotencia {

    
    public static void main(String[] args) {
          Scanner leer = new Scanner (System.in);
          Potencia pot = new Potencia();
            System.out.println("Ingresa el numero a potenciar");
            int numero = leer.nextInt();
            System.out.println("Ingresa hasta que numero quieres potenciar");
            int potencia = leer.nextInt();
            if (potencia<0){
                System.out.println("No existe potencias negativas");
            }else{
                 System.out.println(pot.calcularPotencia(numero,potencia));
            }
    }
    
}
