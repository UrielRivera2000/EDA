package Stack;

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

    public boolean isEmpty() {
        return this.bottom == null;
    }

    public void push(String value) {
        if (isEmpty()) {
            bottom = new Nodo(value);
            top = bottom;
        } else {
            Nodo nuevo = new Nodo(value);
            top.setNext(nuevo);
            top = nuevo;
        }
    }

    public void print() {
        if (!isEmpty()) {
            print(bottom);
        }
    }

    private void print(Nodo next) {
        if (next.getNext() == null) {
            System.out.println(next.getValue());
        } else {
            print(next.getNext());
            System.out.println(next.getValue());
        }
    }

    public String peek() {
        return this.top.getValue();
    }

    public void pop() {
        if (!isEmpty()) {
            if (top == bottom) {
                System.out.println("Eliminando..." + this.bottom.getValue());
                bottom = null;
            }else{
                Nodo next = bottom;
                Nodo temp = top;
                while(next.getNext()!=null && next.getNext()!=top){
                    next = next.getNext();
                }
                next.setNext(null);
                top = next;
                System.out.println("Eliminando..."+temp.getValue());
            }
        }
    }
    
    public int calcularSerieFibonacci(int numero){
        if(numero==0){
            return 0;
        }else{
            if(numero <= 2){
                return 1;
            }
            int serie = calcularSerieFibonacci(numero-1) + calcularSerieFibonacci(numero-2);
            return serie;
        }
        
    }
}
