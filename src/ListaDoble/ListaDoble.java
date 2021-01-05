package ListaDoble;

import java.util.Stack;

public class ListaDoble {

    Nodo first;
    Nodo last;

    public ListaDoble() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void add(Stack data) {
        Nodo next = first;
        if (isEmpty()) {
            Nodo nuevo = new Nodo(data);
            first = nuevo;
            last = nuevo;
        } else {
            while (next.getNext() != null) {
                next = next.getNext();
            }
            Nodo nuevo = new Nodo(data);
            last = nuevo;
            nuevo.setPrev(next);
            next.setNext(nuevo);
        }
    }

    public void print() {
        if (!isEmpty()) {
            Nodo next = first;
            while (next != null) {
                System.out.print(next.getData() + "->");
                next = next.getNext();
            }
        }
    }

    public void reversePrint() {
        if (!isEmpty()) {
            Nodo prev = last;
            while (prev != null) {
                System.out.print(prev.getData() + "<-");
                prev = prev.getPrev();
            }
        }
    }

    public void remove() {
        
        if (!isEmpty()) {
            Nodo aux = first.getNext();
            first = aux;
            first.setPrev(null);
        }
    }

    public void get(int index) {
        int cont = 0;
        Nodo next = first;
        if (index >= 0 && !isEmpty()) {
            while (cont != index && next != null && index < size()) {
                cont++;
                next = next.getNext();
            }
            System.out.println(next.getData());
        } else {
            if (index > size()) {
                System.out.println("Index mayor a la lista");
            } else {
                System.out.println("No hay registros");
            }
        }

    }

    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            Nodo next = first;
            while (next != null) {
                cont++;
                next = next.getNext();
            }
        }
        return cont;
    }

    public void add(Stack data, int index) {
        Nodo next = first, prev = first;
        int cont = 0;
        if(isEmpty()==false && index <= size() && index >=0){
        while (next != null && cont != index && index <size()) {
            cont++;
            prev = next;
            next = next.getNext();
        }
        if(index == size()){
            add(data);
        }else{
            if(index == 0){
               Nodo nuevo = new Nodo(data);  
               first = nuevo;
               first.setNext(prev);
               prev.setPrev(nuevo);
            }else{
               Nodo nuevo = new Nodo(data);
               prev.setNext(nuevo); // first y si siguiente será Nuevo (ingresado)
               nuevo.setPrev(prev); // ingresado su previo será su anterior
               next.setPrev(nuevo); // siguiente (uno ya registrado), su previo será el nuevo (ingresado)
               nuevo.setNext(next); // nuevo, su siguiente vendría siendo el ya ingresado (next)
            }
        }
        }else{
            System.out.println("Error en index o lista vacia");
        }

    }

    public void remove(int index) {
        int cont = 0;
        Nodo prev = first, next = first;
        if (index == 0) {
            remove();
        } else {
            while (next != null && cont != index) {
                cont++;
                prev = next;
                next = next.getNext();
            }
            if (next.getNext() != null) {
                next = next.getNext();
                next.setPrev(prev);
                prev.setNext(next);
            } else {
                prev.setNext(null);
                last = prev;
            }
        }
    }

}
