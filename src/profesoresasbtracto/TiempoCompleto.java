package profesoresasbtracto;

public class TiempoCompleto extends Profesor {

    public TiempoCompleto() {
    }

    public TiempoCompleto(String nombreCompleto, String materia, String titulo, double sueldoBase) {
        super(nombreCompleto, materia, titulo, sueldoBase);
    }

    @Override
    public void mostrarDatos() {

        System.out.println("Los datos son: " + getNombreCompleto() + " Materia: " + getMateria() + " Titulo: " + getTitulo() + " SueldoBase *15: " + getSueldoBase() * 15);
    }

}
