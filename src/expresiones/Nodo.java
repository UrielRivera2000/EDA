
package expresiones;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Nodo {
    String value;
    Nodo next;

    public Nodo(String value){
        this.value = value;
        next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}