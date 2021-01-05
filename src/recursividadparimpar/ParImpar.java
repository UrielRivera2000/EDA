
package recursividadparimpar;

public class ParImpar {
    
    public boolean calcularPar(int num){
        
        if(num ==0){
            return true;
        }else
        return calcularImpar(num-1);
    }
    
    public boolean calcularImpar(int num){
        
         if(num ==0){
            return false;
        }else
        return calcularPar(num-1);
    }
}
