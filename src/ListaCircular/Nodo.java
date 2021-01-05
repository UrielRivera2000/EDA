
package ListaCircular;

public class Nodo {
     Object data;
     Nodo next;

     public Nodo(){
         
     }
    public Nodo(Object data) {
        this.data = data;
        this.next = null;
    }

    
    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    
    
}
