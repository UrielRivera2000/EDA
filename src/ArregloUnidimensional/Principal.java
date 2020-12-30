package ArregloUnidimensional;

import java.util.Scanner;

// @author Francisco Uriel Guerrero Rivera
/*LLenar un arreglo unidimensional de tamaño: 5 y de tipo EstudianteBean
Con tres maneras de llenarlo, cada una con sus pros y contras*/
public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        EstudianteBean[] estudiantes = new EstudianteBean[5];
        // Primera manera de llenar
        estudiantes[0] = new EstudianteBean("Silvia");
        // Segunda manera de llenar
        EstudianteBean e1 = new EstudianteBean("Alejandro");
        estudiantes[1] = e1;
        // Tercera manera de llenarlo
        EstudianteBean e2 = new EstudianteBean();
        e2.setNombre("Belem");
        estudiantes[2] = e2;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Coloca el nombre del estudiante: " + (i + 1));
            EstudianteBean e = new EstudianteBean();
            e.setNombre(leer.nextLine());
            estudiantes[i] = e;

        }
        for (EstudianteBean estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
        }
    }
}
