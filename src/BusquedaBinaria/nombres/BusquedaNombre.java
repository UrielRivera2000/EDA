package BusquedaBinaria.nombres;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class BusquedaNombre {
    public String[] llenarArreglo() {
        String[] nombres = {"Laureano","Jerry","Ilona","Fantomas"
                ,"Nohely","Efren","Marisela","Fabiola","Osviel","Lucena","Karime",
                "Victor","Abril","Mauro","Leira","Amalia","Jimmy","Yulissa","Rosa","Fernanda"};
        return nombres;
    }

    public int buscarNombre(String clave, String[] array) {
        int pos = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().equals(clave.toLowerCase())) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public String ingresarNombre(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el nombre:");
        String nombre = leer.next();
        return nombre;
    }
    
    public void imprimirPosicion(String nombre, String [] resultado){
        if (new BusquedaNombre().buscarNombre(nombre, resultado) == -1) {
            System.out.println("No existe en el arreglo");
        } else {
            System.out.println("Nombre: " + nombre + " se encuentra en la posición: " + new BusquedaNombre().buscarNombre(nombre, resultado));
        }
        System.out.println("");
    }
}
