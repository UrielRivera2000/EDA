package PalabraEspañolAIngles;

/**
 *
 * @author Familia Gro. Rivera
 */
public class BancoPalabra {

    public boolean validarPalabra(String palabra) {
        if (palabra.contains(" ") || palabra.matches(".*[1-9].*") || palabra.matches(".*[^a-z].*")) {
            return false;
        }
        return true;
    }

    public String mostrarPalabraIngles(String palabra, String bancoEspaniol[], String banco[]) {
        String palabraIngles = "";
        for (int i = 0; i < banco.length; i++) {
            if (palabra.equals(bancoEspaniol[i])) {
                palabraIngles = banco[i];
            }
        }
        return palabraIngles;
    }
}
