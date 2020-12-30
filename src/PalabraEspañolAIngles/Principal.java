package PalabraEspañolAIngles;

/**
 *
 * @author Familia Gro. Rivera
 *
 * Llenar un banco de palabras en inglés y su traducción en español. verificar
 * si existe y mostrarla en inglés, el usuario el ingresará en español
 */
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        BancoPalabra bancoPalabra = new BancoPalabra();
        Scanner leer = new Scanner(System.in);
        String[] banco = {"House", "Train", "Car", "Lake", "Moon", "Sun", "Actor",
            "Actress", "silver", "Door", "sad", "Window", "Computer", "Desk", "Email",
            "Supermarket", "Gold", "Iron", "face", "Happy"};

        String[] bancoEspaniol = {"casa", "tren", "carro", "lago", "luna", "sol", "actor", "actriz", "plata",
            "puerta", "triste", "ventana", "computadora", "escritorio", "correo",
            "supermercado", "oro", "hierro", "cara", "feliz"};

        System.out.println("Ingresa una palabra en español: ");
        String palabra = leer.nextLine();

        palabra = palabra.trim().toLowerCase();

        while (bancoPalabra.validarPalabra(palabra) == false) {

            System.out.println("Ingresa solo una palabra, sin espacios o números o caracteres especiales");
            palabra = leer.nextLine().toLowerCase();
        }

        String palabraIngles = bancoPalabra.mostrarPalabraIngles(palabra, bancoEspaniol, banco);

        if (palabraIngles.equals("")) {
            System.out.println("No tengo esa palabra en inglés");
        } else {
            System.out.println("Tu palabra: " + palabra + " en inglés es: " + palabraIngles);
        }

    }
}
