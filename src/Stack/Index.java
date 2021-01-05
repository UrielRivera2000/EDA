package Stack;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Pila con sus respectivios metodos y además calculmamos la serie
     * de fibonacci con un numero ingresado
     */
    public static void main(String[] args) {
       /* Pila pila = new Pila();
        pila.push("1");
        pila.push("4");
        pila.push("3");
        pila.push("2");
        pila.push("1");
        pila.print();
        System.out.println("--------------");
        System.out.println(pila.peek());
        System.out.println("--------------");
        pila.pop();
        pila.print();
        System.out.println("---------------");
        pila.pop();
        pila.pop();
        pila.print();*/
       Pila fibo = new Pila();
       Pila pila = new Pila();
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero tope");
        int numero = leer.nextInt();
        if (numero < 0) {
            System.out.println("No se puede :(");
        } else {
            for (int x = 0; x <= numero; x++) {
               pila.push(""+fibo.calcularSerieFibonacci(x));
                
            }
            pila.print();

        }
       
    }

}
