package Juguetes;

public class Juguete {

    String nombre;
    String marca;
    double costo;

    public Juguete(String nombre, String marca, double costo) {
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
    }

    public Juguete() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
