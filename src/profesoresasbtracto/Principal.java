package profesoresasbtracto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 * Programa de ejemplo de una clase abstracta
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TiempoCompleto tiempoCompleto = new TiempoCompleto();
        TiempoCompleto tiempo = new TiempoCompleto();

        tiempoCompleto.setNombreCompleto("Alejandra");
        tiempoCompleto.setMateria("Materia 1");
        tiempoCompleto.setTitulo("Matematicas");
        tiempoCompleto.setSueldoBase(2500.50);

        tiempo.setNombreCompleto("Hilario");
        tiempo.setMateria("Materia 2");
        tiempo.setTitulo("Español");
        tiempo.setSueldoBase(2565.50);

        Horario horario = new Horario();
        Horario horar = new Horario();

        horario.setNombreCompleto("Fanny");
        horario.setMateria("Materia 1");
        horario.setTitulo("Geografia");
        horario.setSueldoBase(3525.26);
        horario.setHorasQuincenales(123.5);

        horar.setNombreCompleto("Oscar");
        horar.setMateria("Materia 2");
        horar.setTitulo("Artes");
        horar.setSueldoBase(3200.96);
        horar.setHorasQuincenales(123.5);

        List<Horario> listaHoraio = new ArrayList<>();
        listaHoraio.add(horario);
        listaHoraio.add(horar);

        List<TiempoCompleto> listaTiempo = new ArrayList<>();
        listaTiempo.add(tiempoCompleto);
        listaTiempo.add(tiempo);

        System.out.println("Profesores Tiempo Completo");
        for (TiempoCompleto tiempo1 : listaTiempo) {
            tiempo1.mostrarDatos();
        }
        System.out.println("-----------------");
        System.out.println("Profesores por Horario");
        for (Horario hora : listaHoraio) {
            hora.mostrarDatos();
        }
    }

}
