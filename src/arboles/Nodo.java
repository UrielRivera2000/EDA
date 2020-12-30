
package arboles;
public class Nodo {
    private int value;
    private Nodo right;
    private Nodo left;

    public Nodo(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }
    
    
}
