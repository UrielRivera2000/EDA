package arboles;

// @author Francisco Uriel Guerrero Rivera

/*Arboles:
    *Preorden
    *Postorden
    *Inorden
 */
public class Index {

    public static void main(String[] args) {
        Tree arbol = new Tree();
        
        arbol.add(1);
        arbol.add(-2);
        arbol.add(0);
        arbol.add(-9);
        arbol.add(5);
        arbol.add(8);
        arbol.add(15);
        arbol.add(96);
        arbol.add(111);
        arbol.add(75);
        arbol.add(-56);

        arbol.printPreorden();
        System.out.println("");

        arbol.printInorden();
        System.out.println("");
        arbol.printPostOrden();
    }

}
