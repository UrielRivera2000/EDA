package ListaCircular;

// Francisco Uriel Guerrero Rivera
    //Lista circular en java con sus metodos
public class Index {

    public static void main(String[] args) {
        Lista lista = new Lista();
        Nodo lista2 = new Nodo();
        lista2.setData(7);
        lista.add(lista2.getData());
        lista.add("2");
        lista.add(1);
        lista.add(2.3);
        lista.add(true);
        lista.print();
        System.out.println("-------------------");
        
        lista.get(3);
        
        lista.get(5);

        lista.remove();
        lista.remove();
        lista.print();
        System.out.println("------------------------");

        lista.add("2", 0);
        lista.add("3.5", 2);
        lista.add("6", 5);
        lista.print();
        System.out.println("----------------------");

        lista.remove(2);
        lista.remove(4);
        lista.print();
        System.out.println("Tamaño: "+ lista.size());
        
        
    }

}
