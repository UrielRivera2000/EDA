package metodosplit;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Arreglo {
    
    public int [] split (int[]numeros, int i){
        int [] division = null;
        int c=0;
        for (int j = 0; j < numeros.length-1; j++) {
            if(numeros[j] == i){
               c++; 
            }
        }
        if(c==0){
            c++;
        }
        division = new int [c];
        int pos = 0;
        for (int j = 0; j < division.length; j++) {
            for (int k = pos; k < numeros.length; k++) {
                if(numeros[k] != i){
                    pos++;
                    division[j]=division[j]+numeros[k];
                }else{
                    if(k==0){
                        pos++;
                    }else{
                      pos++;
                    break;  
                    }
                    
                }
            }
        }
        return division;
    }
}
