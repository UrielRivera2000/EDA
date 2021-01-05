package numeroCuadrado;

import java.util.ArrayList;
import java.util.List;

// @author Francisco Uriel Guerrero Rivera
/*Programa para obtener el cuadrado de dos listas diferentes */
public class Index {

    public static void main(String[] args) {
        List lista1 = new ArrayList();
        List lista2 = new ArrayList();
        Pila pila3 = new Pila();
        Nodo nodo = new Nodo();
        for (int j = 0; j < 5; j++) {
            double valorEntero = Math.floor(Math.random() * (20 - 1) + 1);
            lista1.add((int) valorEntero);
            double valorEntero2 = Math.floor(Math.random() * (20 - 1) + 1);
            lista2.add((int) valorEntero2);
        }
        for (int i = 0; i < 5; i++) {
            pila3.push(pila3.calcularCuadrado((int) lista1.get(i), 2));
            pila3.push(pila3.calcularCuadrado((int) lista2.get(i), 2));
        }

        pila3.print();

    }

}
