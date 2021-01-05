
package arregloBidiEquipos;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
/**
Programa que guarda en un arreglo
bidimensional de 5 x 2, los siguientes datos
dados por el usuario: nombre de equipo y
puntaje, imprime dicho arreglo y posteriormente
indicar qué equipo salió más bajo y cual fue el
más alto.
*/
public class Principal {
    public static void main(String[] args) {
        
        Equipo equipo [][] = new Equipo().pedirDatos();
        new Equipo().imprimirDatos(equipo);
        new Equipo().obetnerMayorYMenor(equipo);
        
        
    }
}
