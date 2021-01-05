
package recursividadsuma;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class RecursividadSuma {

    /**
     * Realizar la suma de n numero ingresados por el usuario
     * aplicando la recurvidad
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
       
         boolean op = true;
         Suma suma = new Suma();
         while (op ==true){
              System.out.println("Hasta que numero quieres hacer la suma?");
         int num = leer.nextInt();
           if (num < 0){
             System.out.println("No se pueden numeros negativo master");
               System.out.println("Ingresa otro numero");
               
         }else{
            if (num ==0){
                System.out.println("Ingresaste un cero, no es negativo, pero tampoco se puede sumar");
                
            }else{
                 System.out.println("Muy bien elegiste el lado positivo de la vida, el total de la suma es:");
            System.out.println(suma.calcularSuma(num));
            op = false;
            }
           
         }
         }
       
         
    }
    
}
