package PilaMascota;

import java.util.Stack;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Mascota {

    String nombreMascota;
    int edad;
    String duenio;
    String tipoMascota;

    public Mascota() {

    }

    public Mascota(String nombreMascota, int edad, String duenio, String tipoMascota) {
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.duenio = duenio;
        this.tipoMascota = tipoMascota;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public void mostrarMascotas(Stack<Mascota> pila) {
        for (int i = pila.size() - 1; i >= 0; i--) {
            System.out.print(pila.get(i).getNombreMascota() + " ");
            System.out.print(pila.get(i).getEdad() + " ");
            System.out.print(pila.get(i).getDuenio() + " ");
            System.out.print(pila.get(i).getTipoMascota() + " ");
            System.out.println("");

        }

    }

}
