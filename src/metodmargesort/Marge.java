package metodmargesort;

import java.util.Scanner;

/**
 *
 * @author Francisco Uriel Guerrero Rivera
 */
public class Marge {
    
    public int [] llenarArray(){
        Scanner leer = new Scanner(System.in);
        int array[] = new int [20];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresa el numero " + (i+1));
            array[i] = leer.nextInt();
        }
        return array;
    }

    public void sort(int arr[], int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    public void merge(int arr[], int left, int middle, int right) {
        
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + j + 1];
        }
        
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void obtenerTiempo(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        long tiempoInicio = System.currentTimeMillis();
        sort(array, 0, array.length - 1);
        long totalTiempo = System.currentTimeMillis() - tiempoInicio;
        System.out.println("\nEl tiempo Merge:" + totalTiempo + " milisegundos");
       

    }
}
