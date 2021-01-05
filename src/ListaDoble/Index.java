package ListaDoble;
// Francisco Uriel Guerrero Rivera
// Uso de la lista Doble, con sus respectivos metodos
import java.util.Stack;

public class Index {

    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        Stack pila = new Stack(); 
        Stack pila2 = new Stack(); 
        Stack pila3 = new Stack(); 
        Stack pila4 = new Stack(); 
        pila.add("0");
        pila.add(1);
        pila.add(2.5);
        pila.add(true);
        
        pila2.add("1");
        pila2.add(2);
        pila2.add(3.5);
        pila2.add(false);
        
        pila3.add("2");
        pila3.add(3);
        pila3.add(4.5);
        pila3.add(true);
        
        pila4.add("3");
        pila4.add(4);
        pila4.add(5.5);
        pila4.add(false);
        
       System.out.println("primer empty: "+lista.isEmpty());
       
        lista.add(pila);
        lista.add(pila2);
        lista.add(pila3);
        lista.add(pila4);

        lista.print();
        System.out.println("---------------------");

         System.out.println("segundo empty: "+lista.isEmpty());
        System.out.print("get: ");
        lista.get(2);
        
        

        lista.reversePrint();
        
        System.out.println("\nPILA CON REMOVE NORMAL ");
        lista.remove();
        lista.print();
        
      System.out.println("\nAGREGAR PILA");
        lista.add(pila,2);
        lista.print();
         System.out.println(" \nPILA CON REMOVE ASIGNADO");
        lista.remove(2);
        lista.print();
        
        System.out.println("---------------------");
        System.out.println("Tamaño: " + lista.size());
    }

}
