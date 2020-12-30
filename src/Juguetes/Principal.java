package Juguetes;

import java.util.Scanner;

// @author Francisco Uriel Guerrero Rivera
/*LLenar un arreglo unidimensional de tamaño 5
se llenará con un objeto de tipo juguete con los datos de
-nombre
-marca 
-costo 
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Juguete juguetes[] = new Juguete[5];

        for (int i = 0; i < 5; i++) {
            Juguete juguete = new Juguete();
            System.out.println("Juguete numero: " + (i + 1) + "\n");
            System.out.println("Ingresa el nombre: ");
            juguete.setNombre(leer.nextLine());
            System.out.println("Ingresa la marca: ");
            juguete.setMarca(leer.nextLine());
            System.out.println("Ingresa el costo: ");
            try {
                juguete.setCosto(leer.nextDouble());
                leer.skip("\n");
            } catch (Exception e) {
                System.out.println("Error, no se permite cadena: " + e);

            }

            juguetes[i] = juguete;
        }
        for (Juguete juguete : juguetes) {
            System.out.println("--------------------------------");
            System.out.println("Nombre: " + juguete.getNombre());
            System.out.println("Marca: " + juguete.getMarca());
            System.out.println("Costo: " + juguete.getCosto());
            System.out.println("------------------------------");
        }

    }
}
