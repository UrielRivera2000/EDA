package ArregloCuadradoRecursividad;

public class ArregloCuadradosRecursividad {

    public int calcularCuadrado(int n, int n2) {
        if (n2 == 1) {
            return n;
        } else {
            if (n2 == 0) {
                return 1;
            } else {
                return n = n * calcularCuadrado(n, n2 - 1);
            }
        }
    }
}
