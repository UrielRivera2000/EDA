package arregloBidiRegistroEmpleado;

import java.util.Arrays;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class EmpleadoDao {

    public Empleado[][] registros;

    public EmpleadoDao() {
        this.registros = new Empleado[1][2];
    }

    public Empleado[][] getRegistros() {
        return registros;
    }

    public void setRegistros(Empleado[][] registros) {
        this.registros = registros;
    }

    public void mostrarRegistros(Empleado[][] registros) {
        for (int i = 0; i < registros.length; i++) {
            for (int j = 0; j < registros[i].length; j++) {
                if (j == 0) {
                    System.out.println("///////////////");
                    System.out.println("Nombre empleado " + registros[i][j].getNombreCmpleto());
                    System.out.println("Nombre departamento " + registros[i][j].getNombreDpto());
                    System.out.println("Sueldo base " + registros[i][j].getSueldoBase());
                    System.out.println("///////////////");
                } else {
                    System.out.println("///////////////");
                    System.out.println("Nombre jefe " + registros[i][j].getNombreCmpleto());
                    System.out.println("Nombre departamento " + registros[i][j].getNombreDpto());
                    System.out.println("Sueldo base " + registros[i][j].getSueldoBase());
                    System.out.println("////////////////");
                }

            }
        }
    }
}
