
package ListaSimple;

public class Lista {
    Nodo first;
    Nodo last;
    
    public Lista(){
        this.first = null;
        this.last = null;
    }
    
    public boolean isEmpty(){
        if (this.first==null) {
            return true;
        }else{
            return false;
        }
    }
    
    public void add(int data){
        if (isEmpty()) {
            first = new Nodo(data);
            last = first;
        }else{
            Nodo aux = last;
            Nodo nuevo = new Nodo(data);
            aux.setNext(nuevo);
            last = nuevo;
        }
    }
    
    public void print(){
        Nodo next=first;
        while(next!=null){
            System.out.print(next.getData()+"->");
            next = next.getNext();
        }
    }
    
    public void remove(){
        if (!isEmpty()) {
            Nodo aux = first.getNext();
            first = aux;
        }
    }
    
    public void get(int index){
        int cont = 0;
        Nodo next = first;
        while(cont!=index && index>=0 && index<size()){
          cont++;
          next = next.getNext();
        }
        System.out.println(next.getData());
    }
    
    public int size(){
        int cont = 0; 
        if (!isEmpty()) {
            Nodo next = first;
            while(next!=null){
                cont++;
                next = next.getNext();
            }
        }
        return cont;
    }
    
    public void add(int data, int index){
        Nodo next=first, prev=first;
        int cont = 0;
        while(next!=null && cont!=index){
            cont++;
            prev = next;
            next = next.getNext();
        }
        Nodo nuevo=new Nodo(data);
        if (index!=0) {
            prev.setNext(nuevo);
        }else{
            first = nuevo;
        }
        if (index==size()) {
            last=nuevo;
        }
        nuevo.setNext(next);
    }
    
    public void remove(int index){
        int cont = 0;
        Nodo prev=first, next=first;
        if (index==0) {
            remove();
        }else{
            while(next!=null && cont!=index){
                cont++;
                prev=next;
                next=next.getNext();
            }
            if (next.getNext()!=null) {
                next =next.getNext();
                prev.setNext(next);
            }else{
                prev.setNext(null);
                last = prev;
            }
        }
    }
}
