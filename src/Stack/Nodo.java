package Stack;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Nodo {
    private String value;
    private Nodo next;

    public Nodo(){
        
    }
    public Nodo(String value) {
        this.value = value;
        this.next = null;
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
