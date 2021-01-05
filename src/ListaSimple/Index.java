package ListaSimple;
// Francisco Uriel Guerrero Rivera
    // Lista simple, con sus respectivos metodos
public class Index {
    public static void main(String[] args) {
      Lista lista = new Lista();
        
        System.out.println("isEmpty vacio "+lista.isEmpty());
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.print();
        System.out.println("");
        System.out.println("isEmpty lleno "+lista.isEmpty());
        System.out.println("/////////////// SIZE:"+ lista.size());
        lista.remove();
        lista.remove();
        lista.print();
        System.out.println("---------------- GET:");lista.get(1);
        lista.add(2, 0);
        lista.print();
        lista.add(9, 1);
        System.out.println("++++++++++++++++ SIZE:"+ lista.size());
        lista.print();
        lista.add(6, 5);
        System.out.println("******************* SIZE:"+ lista.size());
        lista.print();
        lista.remove(1);
        System.out.println("*-*-*-*-*-*-*-*-*-* SIZE:"+ lista.size());
        lista.print();
    }
}
