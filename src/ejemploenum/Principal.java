/*
 Ejemplo de enum de cafes.
 */
package ejemploenum;

enum cafes{
    LATTE(true, true), AMERICANO(false, false), EXPRESSO(false, true), CAPUCCINO(true, false), OTRO(false, false);
    private boolean azucar;
    private boolean leche;
    
    private cafes(boolean azucar, boolean leche){
        this.azucar= azucar;
        this.leche= leche;
    }

    public boolean isAzucar() {
        return azucar;
    }

    public void setAzucar(boolean azucar) {
        this.azucar = azucar;
    }

    public boolean isLeche() {
        return leche;
    }

    public void setLeche(boolean leche) {
        this.leche = leche;
    }
    
    
}
public class Principal {
enum constantes{}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (cafes cafe : cafes.values()) {
            System.out.println(cafe);
        }
    }
    
}
