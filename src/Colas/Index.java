package Colas;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Index {

    /**
     * Tipos de colas en JAVA
     */
    public static void main(String[] args) {
      /* Queue cola = new Queue() {
           @Override
           public boolean add(Object e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean offer(Object e) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object remove() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object poll() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object element() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object peek() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public int size() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean isEmpty() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean contains(Object o) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Iterator iterator() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object[] toArray() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public Object[] toArray(Object[] a) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean remove(Object o) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean containsAll(Collection c) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean addAll(Collection c) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean removeAll(Collection c) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public boolean retainAll(Collection c) {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void clear() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       }*/
      
      
      Queue <String> cola1 = new LinkedList<>();
      cola1.add("String 1");
      cola1.add("String 2");
      cola1.add("String 3");
      
        System.out.println("El tamaño de la cola es: "+ cola1.size());
        //Pool quita el primer elemento de la cola y te dice cual fue
        System.out.println("Extraer un elemento (eleminiar): "+ cola1.poll());
        System.out.println("El tamaño es: "+ cola1.size());
        
        System.out.println("Consultar primer elemento: "+cola1.peek());
        System.out.println("El tamaño es: "+ cola1.size());
        System.out.println("---------------");
        for (String string : cola1) {
            System.out.println(string);
            
        }
        
        cola1.clear();
        System.out.println("El tamaño es: "+cola1.size());
        System.out.println("------------------------");
        Queue<Integer> cola2 = new LinkedList<>();
        cola2.add(70);
        cola2.add(120);
        cola2.add(6);
        for (Integer integer : cola2) {
            System.out.println(integer);
        }
        
        System.out.println("-----------------------------------");
        PriorityQueue<Integer> cola3 = new PriorityQueue<>();
        cola3.add(70);
        cola3.add(120);
        cola3.add(6);
        //Valor en codigo ascii
        for (Integer integer : cola3) {
            System.out.println(integer);
        }
        System.out.println("----------");
        
        while(!cola3.isEmpty()){
            System.out.println(cola3.poll());
        }
        
        
        
        
    }
    
}
