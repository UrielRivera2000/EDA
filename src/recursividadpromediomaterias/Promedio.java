package recursividadpromediomaterias;

public class Promedio {
      public double calcularPromedio(double n[], int pos){
       if (pos == 0) {
       return (n[pos] + calcularPromedio(n, pos + 1)) / n.length; 
    } 
    if(pos < n.length) {
         return n[pos] + calcularPromedio(n, pos + 1); 
     } 
  return 0;   
    }
}

