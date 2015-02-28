import java.util.Arrays;
import java.util.Random;

// HeapSort implementation for sorting project
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

public class QuickSort {

	public void quicksort(int[] inputArray, int low, int high) {
		if(low < high) {
			int s = partition(inputArray, low, high);
			if(low < s - 1)
				quicksort(inputArray, low, s-1);
			if(s < high)
				quicksort(inputArray, s, high);
		}
		//return inputArray;
	}
	
	// Input: An array[l...r] of integers
	// Partition is always the first element
	// Output: The split position
	public int partition(int[] data, int l, int r) {
		int pivotIndex = randomBetween(l, r);
		int pivotValue = data[pivotIndex];
		int i = l;
		int j = r;
		
		while (i <= j) {
			while(data[i] < pivotValue) {
				i++; 
			}
			while(data[j] > pivotValue){
				j--;
			}
			if (i <= j) {
		     swap(data, i, j);
		     i++;
		     j--;
		    } 
		}
		return i;
	}
	
	
	public int randomBetween(int l, int r) {
	   int n;
	   Random random = new Random();
	   n = random.nextInt(r - l + 1) + l; // random between l inclusive and r exclusive
	   System.out.println("Random: " + n );
	   return n;
	}
	
	
	public void swap(int[] list, int a, int b) {
		int tmp = list[a];
		list[a] = list[b];
		list[b] = tmp;
	}
	
	/*  Commented out as testSuite has main
	public static void main(String args[]) {
		int[] unsorted = RandomArray.generateRandom(20);
		QuickSort q = new QuickSort();
		
		
		System.out.println("Unsorted array: " + Arrays.toString(unsorted));
	    q.quicksort(unsorted, 0, unsorted.length-1);
		System.out.println("Sorted array:   " + Arrays.toString(unsorted));
	}
	*/
}