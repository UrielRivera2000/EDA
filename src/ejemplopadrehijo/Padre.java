package ejemplopadrehijo;

/**
 *
 * @author Familia Gro. Rivera
 */
public class Padre implements Hijo{
    boolean esPadre;

    @Override
    public void esHijo() {
        System.out.println("Todos somos hijos de alguien");
    }

    public boolean isEsPadre() {
        return esPadre;
    }

    public void setEsPadre(boolean esPadre) {
        this.esPadre = esPadre;
    }

    public Padre(boolean esPadre) {
        this.esPadre = esPadre;
    }
    
    public void esPadre(){
        String cadena ="";
        cadena=esPadre?"Si es padre":"No es padre";
        System.out.println(cadena);
    }
}
