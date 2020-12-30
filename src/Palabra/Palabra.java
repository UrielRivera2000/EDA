package Palabra;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Palabra {

    public char[] acomodarPalabra(String palabra) {
        char letras[] = new char[palabra.length()];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.toUpperCase().charAt(i);
        }
        return letras;
    }

    public boolean validarPalabra(String palabra) {
        if (palabra.contains(" ") || palabra.matches(".*[1-9].*") || palabra.matches(".*[^a-z].*")) {
            return false;
        }
        return true;
    }
    
    public void mostrarPalabras(String [] palabras, char []letras2){
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Letra: " + letras2[i] + " Palabra: " + palabras[i]);
        }
    }
}   

