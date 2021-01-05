package expresiones;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Obtener una expresión de prefija a sufija
 * Obtener una expresión de infija a postfija
 */
public class Index {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int opc = 0;
        do{
            System.out.println("BIENVENIDO CRACK :3");
            IaP infijaAPrefija = new IaP();
		infijaAPrefija.iniciarEvaluacion();
		System.out.println();
		IaS infijaAPostfija = new IaS();
		infijaAPostfija.iniciarEvaluacion();
                System.out.println("Deseas evaluar otra expresion? 1)si, 2)no");
                opc = leer.nextInt();
                

        }while(opc != 2);
		
	}
}
