package PilaMascota;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Porgrama que pide datos de una mascota: 
 * Nombre de la mascota 
 * edad
 * nombre del dueño
 * Tipo de mascota
 * estos datos son alamacenados en un pila y posteriormente se imprime
 */
public class Index {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Stack<Mascota> pila = new Stack<Mascota>();
        
        int opc=0;
        do{
        Mascota mascota = new Mascota();
        System.out.println("---------BIENVENIDO----------");
        System.out.println("Ingresa el nombre de la mascota");
        mascota.setNombreMascota(leer.nextLine());
       
        System.out.println("Ingresa la edad de la mascota");
        mascota.setEdad(leer.nextInt());
        leer.skip("\n");
        System.out.println("Ingresa el nombre del dueño");
        mascota.setDuenio(leer.nextLine());
        System.out.println("Ingresa el tipo de animal (perro, gato, tortuga, etc..)");
        mascota.setTipoMascota(leer.nextLine());
        pila.push(mascota);
        System.out.println("Deseas ingresar otro? 1=si, 0=No ");
        opc = leer.nextInt();
        leer.skip("\n");
        }while(opc!=0);
        
        new Mascota().mostrarMascotas(pila);
        
    }
    
}
