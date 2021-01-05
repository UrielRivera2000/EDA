package claseabstracta;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class hombre extends persona {

    public hombre(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Los datos son: " + getNombre() + " " + getEdad() + " " + getDireccion());
    }
}
