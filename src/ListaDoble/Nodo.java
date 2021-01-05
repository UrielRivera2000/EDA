package ListaDoble;

import java.util.Stack;

public class Nodo {
    private Stack data;
    private Nodo next;
    private Nodo prev;

    public Nodo(Stack data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Stack getData() {
        return data;
    }

    public void setData(Stack data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrev() {
        return prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }
    
    
}
