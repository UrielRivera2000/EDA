package FibonacciRecursividadIndirecta;


/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Pila {
      Nodo top;
    Nodo bottom;

    public Pila() {
        this.top = null;
        this.bottom = null;
    }
    
    public boolean isEmpty(){
        return this.bottom==null;
    }
    
    public void push(int data){
        if (isEmpty()) {
            bottom = new Nodo(data);
            top = bottom;
        }else{
            Nodo nuevo = new Nodo(data);
            top.setNext(nuevo);
            top = nuevo;
        }
    }
    
    public void print(){
        if (!isEmpty()) {
            print(bottom);
        }
    }
    
    private void print(Nodo next){
        if (next.getNext()==null) {
            System.out.println(next.getData());
        }else{
            print(next.getNext());
            System.out.println(next.getData());
        }
    }
    
    public int peek(){
        return this.top.getData();
    }
    
        
    public void pop(){
        if (!isEmpty()) {
            if (top==bottom) {
                System.out.println("Eliminando..." + this.bottom.getData());
                bottom = null;
            }else{
                Nodo next = bottom;
                Nodo temp = top;
                
                while(next.getNext()!=null && next.getNext()!=top){
                    next = next.getNext();
                }
                next.setNext(null);
                top = next;
                System.out.println("Eliminando..." + temp.getData());
            }
        }
    }
}
