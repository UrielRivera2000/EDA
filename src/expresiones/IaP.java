
package expresiones;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class IaP {
   private Pila pi = new Pila();
	private Scanner leer = new Scanner(System.in);
	private String expI;
	private Pila expR = new Pila();
	private String OPE = "/*-+";

	public void iniciarEvaluacion() {
		System.out.println("\tinfija a postfija (sufija)");
		System.out.print("Ingresa la expresión a evaluar :) ");
		expI = leer.next();
		convertirExpresion();
	}

	public void voltearCadena(String expresionTemp){
		for (int i = 0;i<expresionTemp.length();i++)
			expR.push(""+expresionTemp.charAt(i));
		expR.print();
	}

	public void convertirExpresion() {
		String expresionTemporal = "";
		for (int i = expI.length() - 1; i >= 0; i--) {
			char carac = expI.charAt(i);
			if (carac == ')' || OPE.indexOf(carac) != -1) {
				pi.push("" + carac);
			} else if (carac == '(') {
				while (!pi.peek().equals(")")) {
					expresionTemporal += pi.peek();
					pi.pop();
				}
				pi.pop();
			} else {
				expresionTemporal += carac;
			}
		}
		while (!pi.isEmpty()){
			expresionTemporal += pi.peek();
			pi.pop();
		}
		voltearCadena(expresionTemporal);
	
        }}
        
