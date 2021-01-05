
package ejemplopadrehijo;

/**
 *
 * @author Familia Gro. Rivera
 */
public  class Principal {

    /**
     * Ejemplo de la aplicación de una interfaz, padre -hijo
     */
    public static void main(String[] args) {
        Padre p1= new Padre (true);
        Padre p2= new Padre (false);
        Padre p3= new Padre (true);
        p1.esHijo();
        p1.esPadre();
        
        p2.esHijo();
        p2.esPadre();
        
        p3.esPadre();
    
    }
    
}
