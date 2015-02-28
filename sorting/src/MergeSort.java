// MergeSort implementation for sorting project
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

public class MergeSort {
	//mergeSort: sorts input array by recursive mergesort
	//Input: An array A[0…n-1] orderable integers
	//Output: Array A[0…n-1] sorted in nondecreasing order
	public int[] mergeSort(int[] inputArray) {
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
				array2[j - lengthArray1] = inputArray[j];

			//Recursively call mergeSort on sub-arrays
			mergeSort(array1);
			mergeSort(array2);

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
			while (j != lengthArray2) {
				inputArray[k] = array2[j];
				j++;
				k++;
			}
			while (i != lengthArray1) {
				inputArray[k] = array1[i];
				i++;
				k++;
			}
		}
		return inputArray; //return sorted input array
	}

	/*  Commented out as testSuite has main
	public static void main(String args[]) { 
		MergeSort m = new MergeSort();

		int[] unsorted = RandomArray.generateRandom();
		System.out.print("Unsorted array: ");
		for (int i = 0; i < unsorted.length; i++)
			System.out.print(unsorted[i] + " ");
		System.out.println();

		int[] sorted = m.mergeSort(unsorted);
		System.out.print("Sorted array:   ");
		for (int i = 0; i < sorted.length; i++)
			System.out.print(sorted[i] + " ");
		System.out.println();

	}
	*/
}