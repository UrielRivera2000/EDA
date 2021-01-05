
package expresiones;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Pila {
    Nodo top;
    Nodo bottom;

    public Pila(){
        top = null;
        bottom = null;
    }

    public boolean isEmpty(){
        return this.bottom == null;
    }

    public void push(String value){
        if(isEmpty()){
            bottom = new Nodo(value);
            top = bottom;
        }else{
            Nodo nuevo = new Nodo(value);
            top.setNext(nuevo);
            top = nuevo;
        }
    }

    public void print(){
        print(bottom);
    }

    public void print(Nodo next){
        if(next.getNext() == null){
            System.out.print(" "+next.getValue());
        }else{
            print(next.getNext());
            System.out.print(" "+next.getValue());
        }
    }

    public void pop() {
        if (!isEmpty()) {
            if (top == bottom) {
              //  System.out.println("eliminando..... " + this.bottom.getValue());
                bottom = null;
            } else {
                Nodo next = bottom;
                Nodo temp = top;
                while (next.getNext() != null && next.getNext() != top) {
                    next = next.getNext();
                }
                next.setNext(null);
                top = next;
               // System.out.println("eliminando.... " + temp.getValue());
            }
        }
    }

    public String peek() {
        return this.top.getValue();
    }
}
