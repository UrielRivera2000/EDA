package arregloBidiEquipos;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */

public class Equipo {

    public String nombreEquipo;
    public double puntaje;

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public Equipo[][] pedirDatos() {
        Scanner leer = new Scanner(System.in);
        Equipo equipo[][] = new Equipo[2][2];

        for (int i = 0; i < equipo.length; i++) {
            for (int j = 0; j < equipo[i].length; j++) {
                Equipo equip = new Equipo();

                System.out.println("Ingresa el nombre del equipo");
                equip.setNombreEquipo(leer.nextLine());

                System.out.println("Ingresa el puntaje");
                try {
                    equip.setPuntaje(leer.nextDouble());
                    equipo[i][j] = equip;
                    leer.skip("\n");
                } catch (Exception e) {
                    System.out.println("Ingresa un valor numerico a la proxima :)"
                            + "Por ende no va a compilar de buena manera");

                }

            }
        }
        return equipo;
    }

    public void imprimirDatos(Equipo equipo[][]) {
        for (int i = 0; i < equipo.length; i++) {
            for (int j = 0; j < equipo[i].length; j++) {

                System.out.print(" nombre del equipo: " + equipo[i][j].getNombreEquipo());
                System.out.print(" puntaje: " + equipo[i][j].getPuntaje() + "\n");
            }
        }
    }

    public void obetnerMayorYMenor(Equipo equipo[][]) {
        double mayor = Double.MIN_VALUE, menor = Double.MAX_VALUE, empate = 0;
        int cont = 0, cont2 = 0;
        String equipoMayor = "", equipoMenor = "", empatesMayor = "", empatesMenor = "";
        for (int i = 0; i < equipo.length; i++) {
            for (int j = 0; j < equipo[i].length; j++) {

                if (equipo[i][j].getPuntaje() > mayor) {
                    mayor = equipo[i][j].getPuntaje();
                    equipoMayor = "\nEquipo mayor: " + equipo[i][j].getNombreEquipo() + " Puntaje mayor: " + equipo[i][j].getPuntaje() + "\n";

                } else {
                    if (equipo[i][j].getPuntaje() < menor) {
                        menor = equipo[i][j].getPuntaje();
                        equipoMenor = "Equipo menor: " + equipo[i][j].getNombreEquipo() + " Puntaje menor: " + equipo[i][j].getPuntaje();
                    }
                }

            }
        }
        for (int i = 0; i < equipo.length; i++) {
            for (int j = 0; j < equipo[i].length; j++) {
                if (equipo[i][j].getPuntaje() == mayor) {
                    empatesMayor =empatesMayor + "Empates mayor " + equipo[i][j].getNombreEquipo() + " Puntaje empate: " + equipo[i][j].getPuntaje() + "\n";
                    cont++;
                } else {
                    if (equipo[i][j].getPuntaje() == menor) {
                        empatesMenor = empatesMenor +"Empates menor " + equipo[i][j].getNombreEquipo() + " Puntaje empate: " + equipo[i][j].getPuntaje() + "\n";
                        cont2++;
                    }
                }
            }
        }
        if (cont >= 2 && cont2 >=2) {
            System.out.println("");
            System.out.println(empatesMayor);
            System.out.println(empatesMenor);
        }else{ 
              if(cont >= 2){
                  System.out.println("");
                  System.out.println(empatesMayor);
                  System.out.println(equipoMenor);
              }else{
                  if( cont2 >=2){
                      System.out.println("");
                      System.out.println(equipoMayor);
                      System.out.println(empatesMenor);
                  }else{
                     System.out.println(equipoMayor);
                     System.out.println(equipoMenor);
                  }
              }  
                    
        }

    }

}
