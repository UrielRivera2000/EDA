package recursividadpotencia;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Potencia {
       public int calcularPotencia(int n, int n2){
        if(n==0){
            return 1;
        }else{
            return n = n*calcularPotencia(n,n2-1);
        }
    }
}
