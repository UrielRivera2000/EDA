
package ListaCircular;

public class Lista {

    Nodo first;
    Nodo last;

    public Lista() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void add(Object data) {
        if (isEmpty()) {
            first = new Nodo(data);
            last = first;
            last.setNext(first);
        } else {
            Nodo nuevo = new Nodo(data);
            last.setNext(nuevo);
            last = nuevo;
            last.setNext(first);
        }

    }

    //size, add (indice), delete, delete(size),get
    public void print() {
        if (!isEmpty()) {
            Nodo next = first;
            while (next.getNext() != first) {
                System.out.print(next.getData() + "->");
                next = next.getNext();
            }

            System.out.println(next.getData());
            System.out.println("");
            System.out.println("Lista circular");
            System.out.println(next.getNext().getData());
        }
    }

    public int size() {
        int cont = 0;

        if (!isEmpty()) {
            Nodo next = first;
            if (next.getNext() == first) {
                cont = 1;
            } else {
                while (next.getNext() != first) {
                    cont++;
                    next = next.getNext();
                }
                cont = cont + 1;
            }

        }
        return cont;
    }

    public void add(Object data, int index) {
        Nodo next = first, prev = first;
        int cont = 0;
        while (next != null && cont != index) {
            cont++;
            prev = next;
            next = next.getNext();

        }

        if (index != 0) {

            Nodo nuevo = new Nodo(data);
            prev.setNext(nuevo);
            nuevo.setNext(next);

        } else {
            if (index == size()) {
                Nodo nuevo = new Nodo(data);
                last.setNext(nuevo);
                last = nuevo;
                last.setNext(first);
            } else {
                Nodo nuevo = new Nodo(data);
                first = nuevo;
                first.setNext(next);
                last.setNext(first);
            }

        }

    }

    public void remove() {

        if (!isEmpty()) {
            Nodo aux = first.getNext();
            first = aux;
            last.setNext(aux);

        }
    }

    public void remove(int index) {

        int cont = 0;
        Nodo prev = first, next = first;
        if (!isEmpty() && index < size()) {
            if (index == 0) {

                remove();
            } else {
                if (index == size()) {
                    remove();
                } else {
                    while (cont != index) {
                        cont++;
                        prev = next;
                        next = next.getNext();

                    }

                    next = next.getNext();
                    prev.setNext(next);

                }
            }
        } else {
            System.out.println("Tamaño excedido");
        }

    }

    public void get(int index) {
        int cont = 0;
        Nodo next = first;
        if (index == size()) {
            System.out.println("get: ");
        } else {
            if (index == 0) {
                System.out.println("get: " + first.getData());
            } else {
                while (cont != index && index >= 0 && index < size()) {
                    cont++;
                    next = next.getNext();
                }
                System.out.println("get: " + next.getData());
            }
        }

    }

}
