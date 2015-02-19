// MergeSort implementation for sorting project
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

public class MergeSort {
	//mergeSort: sorts input array by recursive mergesort
	//Input: An array A[0…n-1] orderable integers
	//Output: Array A[0…n-1] sorted in nondecreasing order
	public int[] MergeSort(int[] inputArray) {
		if (inputArray.length > 1) {
			//Get lengths for sub-arrays
			int lengthArray1 = inputArray.length/2;
			int lengthArray2 = inputArray.length - lengthArray1;

			//Create sub-arrays and copy elements into each
			int[] array1 = new int[lengthArray1];
			int[] array2 = new int[lengthArray2];
			for (int i = 0; i < lengthArray1; i++) 
				array1[i] = inputArray[i];
			for (int j = lengthArray1; j < inputArray.length; j++)
				array2[j] = inputArray[j];

			//Recursively call mergeSort on sub-arrays
			MergeSort(array1);
			MergeSort(array2);

			//Merge the 2 sorted sub-arrays into one sorted array
			int i = 0, j = 0, k = 0;
			while (i < lengthArray1 && j < lengthArray2) {
				if (array1[i] <= array2[j]) {
					inputArray[k] = array1[i];
					i++;
				} else {
					inputArray[k] = array2[j];
					j++;
				}
				k++;
			}
			//If one sub-array is completely copied, copy the remaining elements from the other sub-array
			if (i == lengthArray1) {
				while (j < lengthArray2) {
					inputArray[k] = array2[j];
					j++;
					k++;
				}
			} else {
				while (i < lengthArray1) {
					inputArray[k] = array1[j];
					i++;
					k++;
				}
			}
		}
		return inputArray; //return sorted input array
	}
	
	public static void main(String args[]) { 
		System.out.println("Should print here");
		
	}
}