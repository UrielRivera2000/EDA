package profesoresasbtracto;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public abstract class Profesor {

    String nombreCompleto;
    String materia;
    String titulo;
    double sueldoBase;
    double horasQuincenales;

    public Profesor() {

    }

    public Profesor(String nombreCompleto, String materia, String titulo, double sueldoBase) {
        this.nombreCompleto = nombreCompleto;
        this.materia = materia;
        this.titulo = titulo;
        this.sueldoBase = sueldoBase;
    }

    public Profesor(String nombreCompleto, String materia, String titulo,
            double sueldoBase, double horasQuincenales) {
        this.nombreCompleto = nombreCompleto;
        this.materia = materia;
        this.titulo = titulo;
        this.sueldoBase = sueldoBase;
        this.horasQuincenales = horasQuincenales;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHorasQuincenales() {
        return horasQuincenales;
    }

    public void setHorasQuincenales(double horasQuincenales) {
        this.horasQuincenales = horasQuincenales;
    }

    abstract public void mostrarDatos();
}
