import java.util.Arrays;

// HeapSort implementation for sorting project
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

public class Quicksort {

	public int[] quicksort(int[] inputArray, int low, int high) {
		int s = 0;
		
		if(low < high) {
			s = partition(inputArray, low, high);
			quicksort(inputArray, low, s-1);
			quicksort(inputArray, s+1, high);
		}
		return inputArray;
	}
	
	// Input: An array[l...r] of integers
	// Partition is always the first element
	// Output: The split position
	public int partition(int[] data, int l, int r) {
		if(l >= r) {
			return r; //Not sure what I should return in this case...
		}
		int pivotValue = data[l];
		int i = l;
		int j = r+1;
		
		do {
			do {
				i++; //This goes out of bounds. Book mentions adding a sentinal if not using random pivot
			} while(data[i] >= pivotValue); 
			do {
				j--;
			} while(data[j] <= pivotValue);
			System.out.println(Arrays.toString(data));
			swap(data, i, j);
			System.out.println(Arrays.toString(data));
		} while(i >= j);
		swap(data, i, j);
		swap(data, 0, j);
		
		return j;
	}
	
	public void swap(int[] list, int a, int b) {
		int tmp = list[a];
		list[a] = list[b];
		list[b] = tmp;
	}
	
	public static void main(String args[]) {
		int[] unsorted = RandomArray.generateRandom(10);
		Quicksort q = new Quicksort();
		
		System.out.print("Unsorted array: " + Arrays.toString(unsorted));
		System.out.println();

		int[] sorted = q.quicksort(unsorted, 0, unsorted.length);
		System.out.print("Sorted array:   " + Arrays.toString(sorted));
		System.out.println();
	}
}