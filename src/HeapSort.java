import java.util.Arrays;

// HeapSort implementation for sorting project
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

public class HeapSort {

    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int max;
    
    private static void buildHeap(int[] a){
        n = a.length -1;
        
        for(int i = n/2; i >= 0; i--){
            maxHeap(a,i);
        }
    }
    
    private static void maxHeap(int[] a, int i){
        left  = 2 * i;
        right = 2 * i + 1;
        
        if(left <= n && a[left] > a[i])
            max = left;
        else
            max = i;
            
        if(right <= n && a[right] > a[max])
            max = right;
        
        if(max != i){
            swap(i, max);
            maxHeap(a, max);
        }
    }
    
    private static void swap(int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;        
    }
    
    private static void sort(int[] a0){
        a = a0;
        buildHeap(a);
        
        for(int i = n; i > 0; i--){
            swap(0, i);
            n = n -1;
            maxHeap(a, 0);
        }
    }
    
    public static void main(String[] args){
    	int[] a1 = { 3, 2, 1, 5, 4 };
        
        for(int i = 0; i < a1.length; i++)
            System.out.print(a1[i] + " ");    

        System.out.println();
        
        sort(a1);
        
        for(int i = 0; i < a1.length; i++)
            System.out.print(a1[i] + " ");
       		
    }

}