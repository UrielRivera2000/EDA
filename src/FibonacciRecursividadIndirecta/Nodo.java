package FibonacciRecursividadIndirecta;


/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Nodo {
        private int data;
    private Nodo next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo(int data, Nodo next) {
        this.data = data;
        this.next = next;
    }

    public Nodo(int data) {
        this.data = data;
    }

   
    
}