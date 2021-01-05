package profesoresasbtracto;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Horario extends Profesor {

    public Horario() {

    }

    public Horario(String nombreCompleto, String materia, String titulo, double sueldoBase, double horasQuincenales) {
        super(nombreCompleto, materia, titulo, sueldoBase, horasQuincenales);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Los datos son: " + getNombreCompleto()
                + " Materia: " + getMateria() + " Titulo: " + getTitulo()
                + " SueldoBase *15: " + getSueldoBase() * getHorasQuincenales() + " Horas Quicenales: " + getHorasQuincenales() + "Horas: ");
    }

}
