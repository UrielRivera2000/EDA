
package PalabraRecursividad;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Pedir una palabra y obtener letra por letra mediante la recursividad
     * llenar el arreglo con cada letra e imprimir
     * 
     */
    public static void main(String[] args) {
         String palabra = new Palabra().pedirPalabra();
         char arrar [] = new char [palabra.length()];
          char arreglo[] = new Palabra().arreglo(palabra, 0,arrar);
          new Palabra().imprimirArreglo(arreglo, 0);
         
    }
    }
    

