package ArregloCuadradoRecursividad;
// Francisco Uriel Guerrero Rivera

/*Arreglo de cuadrados aplicando la recursividad directa
llena arreglo con un for y el valor que se almacena en cada posición es el cuadrado
de los primeros diez números, a partir del 1 */

public class Principal {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        ArregloCuadradosRecursividad valores = new ArregloCuadradosRecursividad();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = valores.calcularCuadrado(i + 1, 2);
        }

        for (int i : arreglo) {
            System.out.println(i);
        }
    }
}
