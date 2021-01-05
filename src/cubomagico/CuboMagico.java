/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubomagico;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Familia Gro. Rivera
 */
public class CuboMagico {

    public List<Integer> llenarLista() {
        List<Integer> lista = new ArrayList();
        for (int i = 0; i < 9; i++) {
            lista.add(0);
        }
        return lista;
    }

    public void imprimirLista(List<Integer> lista) {
        for (int i = 0; i < 9; i++) {
            if (i == 3) {
                System.out.println("");
            }
            if (i == 6) {
                System.out.println("");
            }

            if (i < 3) {
                System.out.print(lista.get(i) + " ");
            } else {

                if (i >= 3 && i < 6) {
                    System.out.print(lista.get(i) + " ");
                } else {
                    if (i >= 6 && i < 9) {
                        System.out.print(lista.get(i) + " ");
                    }
                }
            }

        }
    }

    public List<Integer> elegirEspacio(List<Integer> lista, int eleccion) {
        Scanner leer = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingresa las coordenadas");
        System.out.println("Coordenada vertical");
        int fila = leer.nextInt();
        System.out.println("Coordenada Horizontal");
        int columna = leer.nextInt();

        if (fila < 3 && columna < 3 && fila >= 0 && columna >= 0) {
            if (fila == 0 && columna == 0 && !lista.contains(eleccion)) {
                lista.remove(0);
                lista.add(0, eleccion);
            }
            if (fila == 0 && columna == 1 && !lista.contains(eleccion)) {
                lista.remove(1);
                lista.add(1, eleccion);
            }
            if (fila == 0 && columna == 2 && !lista.contains(eleccion)) {
                lista.remove(2);
                lista.add(2, eleccion);
            }
            if (fila == 1 && columna == 0 && !lista.contains(eleccion)) {
                lista.remove(3);
                lista.add(3, eleccion);
            }
            if (fila == 1 && columna == 1 && !lista.contains(eleccion)) {
                lista.remove(4);
                lista.add(4, eleccion);
            }
            if (fila == 1 && columna == 2 && !lista.contains(eleccion)) {
                lista.remove(5);
                lista.add(5, eleccion);
            }
            if (fila == 2 && columna == 0 && !lista.contains(eleccion)) {
                lista.remove(6);
                lista.add(6, eleccion);
            }
            if (fila == 2 && columna == 1 && !lista.contains(eleccion)) {
                lista.remove(7);
                lista.add(7, eleccion);
            }
            if (fila == 2 && columna == 2 && !lista.contains(eleccion)) {
                lista.remove(8);
                lista.add(8, eleccion);
            }
        } else {
            System.out.println("Error en coordenadas fuera de limite");
        }
        return lista;
    }

    public int validarSumaVertical(List<Integer> lista) {
        int vo = lista.get(0) + lista.get(3) + lista.get(6);
        int v1 = lista.get(1) + lista.get(4) + lista.get(7);
        int v2 = lista.get(2) + lista.get(5) + lista.get(8);
        if(vo == 15 && v1==15 && v2==15){
            return 3;
        }
        
        if(lista.get(0) != 0 && lista.get(3) != 0 && lista.get(6) != 0){
            if(vo<15){
                return 4;
            }
        }
         if(lista.get(1) != 0 && lista.get(4) != 0 && lista.get(7) != 0){
            if(v1<15){
                return 4;
            }
        }
          if(lista.get(2) != 0 && lista.get(5) != 0 && lista.get(8) != 0){
            if(v2<15){
                return 4;
            }
        }
        if (vo == 15) {
            if (lista.get(0) != 0 && lista.get(3) != 0 && lista.get(6) != 0) {
                return 1;
            } else {
                return 2;
            }

        } else {
            if (v1 == 15) {
                if (lista.get(1) != 0 && lista.get(4) != 0 && lista.get(7) != 0) {
                    return 1;
                } else {
                    return 2;
                }

            } else {
                if (v2 == 15) {
                    if (lista.get(2) != 0 && lista.get(5) != 0 && lista.get(8) != 0) {
                        return 1;
                    } else {
                        return 2;
                    }

                }
            }
        }
        if (vo > 15) {
            return 2;
        } else {
            if (v1 > 15) {
                return 2;
            } else {
                if (v2 > 15) {
                    return 2;
                } else {
                    return 0;
                }
            }
        }

    }

    public int validarSumaHorizontal(List<Integer> lista) {
        int ho = lista.get(0) + lista.get(1) + lista.get(2);
        int h1 = lista.get(3) + lista.get(4) + lista.get(5);
        int h2 = lista.get(6) + lista.get(7) + lista.get(8);
        if(ho == 15 && h1==15 && h2==15){
            return 3;
        }
          if(lista.get(0) != 0 && lista.get(1) != 0 && lista.get(2) != 0){
            if(ho<15){
                return 4;
            }
        }
         if(lista.get(3) != 0 && lista.get(4) != 0 && lista.get(5) != 0){
            if(h1<15){
                return 4;
            }
        }
          if(lista.get(6) != 0 && lista.get(7) != 0 && lista.get(8) != 0){
            if(h2<15){
                return 4;
            }
        }
        
        if (ho == 15) {
            if (lista.get(0) != 0 && lista.get(1) != 0 && lista.get(2) != 0) {
                return 1;
            } else {
                return 2;
            }

        } else {
            if (h1 == 15) {
                if (lista.get(3) != 0 && lista.get(4) != 0 && lista.get(5) != 0) {
                    return 1;
                } else {
                    return 2;
                }

            } else {
                if (h2 == 15) {
                    if (lista.get(6) != 0 && lista.get(7) != 0 && lista.get(8) != 0) {
                        return 1;
                    } else {
                        return 2;
                    }

                }
            }
        }
        if (ho > 15) {
            return 2;
        } else {
            if (h1 > 15) {
                return 2;
            } else {
                if (h2 > 15) {
                    return 2;
                } else {
                    return 0;
                }
            }
        }

    }

    public int validarSumaDiagonal(List<Integer> lista) {
        int Do = lista.get(0) + lista.get(4) + lista.get(8);
        int d1 = lista.get(2) + lista.get(4) + lista.get(6);
        if(Do == 15 && d1==15){
            return 3;
        }
          if(lista.get(0) != 0 && lista.get(4) != 0 && lista.get(8) != 0){
            if(Do<15){
                return 4;
            }
        }
         if(lista.get(2) != 0 && lista.get(4) != 0 && lista.get(6) != 0){
            if(d1<15){
                return 4;
            }
        }
        
        if (Do == 15) {
            if (lista.get(0) != 0 && lista.get(4) != 0 && lista.get(8) != 0) {
                return 1;
            } else {
                return 2;
            }

        } else {
            if (d1 == 15) {
                if (lista.get(2) != 0 && lista.get(4) != 0 && lista.get(6) != 0) {
                    return 1;
                } else {
                    return 2;
                }

            }
        }
        if (Do > 15) {
            return 2;
        } else {
            if (d1 > 15) {
                return 2;
            } else {

                return 0;

            }
        }
    }
}
