package arboles;

public class Tree {

    Nodo root;

    // Constructor inicializado en null
    public Tree() {
        this.root = null;
    }

    //verificamos si el arobol está vacío
    public boolean isEmpty() {

        return this.root == null;
    }

    // Metodo add principal lo va a ver el usuario (publico)
    public void add(int value) {
        Nodo nuevo = new Nodo(value);
        this.add(nuevo, this.root);
    }

    // Metodo add recursivo que realizará la operación de add
    //arbol
    private void add(Nodo nuevo, Nodo raiz) {
        if (isEmpty()) {
            this.root = nuevo;
        } else {
            if (nuevo.getValue() <= raiz.getValue()) {
                if (raiz.getLeft() == null) {
                    raiz.setLeft(nuevo);
                } else {
                    //recorrer
                    add(nuevo, raiz.getLeft());
                }
            } else {
                if (raiz.getRight() == null) {
                    raiz.setRight(nuevo);

                } else {
                    add(nuevo, raiz.getRight());
                }
            }

        }

    }

    //Impresión preorden
    public void printPreorden() {
        printPreorden(this.root);
    }

    private void printPreorden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getValue() + " ");
            printPreorden(raiz.getLeft());
            printPreorden(raiz.getRight());
        }
    }

    // Impresión inorden
    public void printInorden() {
        printInorden(this.root);
    }

    private void printInorden(Nodo raiz) {
        if (raiz != null) {
            printInorden(raiz.getLeft());
            System.out.print(raiz.getValue() + " ");
            printInorden(raiz.getRight());
        }

    }

    //impresión postorden
    public void printPostOrden() {
        printPostOrden(this.root);
    }

    private void printPostOrden(Nodo raiz) {
        if (raiz != null) {
            printPostOrden(raiz.getLeft());
            printPostOrden(raiz.getRight());
            System.out.print(raiz.getValue() + " ");

        }
    }
}
