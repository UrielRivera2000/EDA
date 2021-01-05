package recursividadpromediomaterias;

import java.util.Scanner;

/*Francisco Uriel Guerrero Rivera

Obtener el promedio de un numero n de materias ingresado por el usuario
aplicando la recursividad*/
public class RecursividadPromedioMaterias {

    
    public double [] llenado(double materias [], int cont){
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa la calificación");
        materias[cont]=leer.nextDouble();
        if(materias[cont]<0){
            System.out.println("Ingresa una calificación valida");
            materias[cont]=leer.nextDouble();
            return llenado(materias,cont);
        }else{
            cont++;
        if (materias.length == cont){
            return materias;
             } 
         }
      
        return llenado(materias,cont);
    }
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Cuantas materias ingresaras?");
        int numMaterias = leer.nextInt();
        int cont =0;
        double materias [] = new double [numMaterias];
        RecursividadPromedioMaterias llena = new RecursividadPromedioMaterias();
        llena.llenado(materias, cont);
        Promedio prom = new Promedio();
        System.out.println("Promedio final: "+prom.calcularPromedio(materias, cont));
        
    }
    
    
    
}
