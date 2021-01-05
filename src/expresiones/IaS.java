package expresiones;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
import java.util.Scanner;
public class IaS {
     private Pila miPila = new Pila();
	private Scanner leer = new Scanner(System.in);
	private String expresionUsuario;
	private Pila expresionResultado = new Pila();
	private String OPE = "/*-+";

	public void iniciarEvaluacion() {
		System.out.println("\tExpresion de infija a postfija");
		System.out.print("Ingresa la expresión a converir :) ");
		expresionUsuario = leer.next();
		convertirExpresion();
	}

	public void voltearCadena(String expresionTemp){
		for (int i = expresionTemp.length()-1;i>=0;i--)
			expresionResultado.push(""+expresionTemp.charAt(i));
		expresionResultado.print();
	}

	public void convertirExpresion(){
		String expresionTemporal = "";
		for (int i = 0; i< expresionUsuario.length(); i++) {
			char carac = expresionUsuario.charAt(i);
			if (carac == '(' || OPE.indexOf(carac) != -1) {
				miPila.push("" + carac);
			} else if (carac == ')') {
				while (!miPila.peek().equals("(")) {
					expresionTemporal += miPila.peek();
					miPila.pop();
				}
				miPila.pop();
			} else {
				expresionTemporal += carac;
			}
		}
		while (!miPila.isEmpty()){
			expresionTemporal += miPila.peek();
			miPila.pop();
		}
		voltearCadena(expresionTemporal);
	}
}
