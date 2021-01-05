package claseabstracta;

public class Mujer extends persona {

    public Mujer(String nombre, int edad, String direccion) {
        super(nombre, edad, direccion);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Los datos son: " + getNombre() + " " + getEdad() + " " + getDireccion());

    }

}
