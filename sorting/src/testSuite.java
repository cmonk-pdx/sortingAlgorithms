// A sorting suite to read in files, create data structure, run & time the sorting tests and
// output the time & sorting results of the sorts.
//
// Creates an array by reading in the data file and using first integer listed as the
// size of the array.
//   e.g. sample.in (n, i, ... , j) will create an array of size n
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class testSuite {
	
	public static void main(String [] args) {		
		if(args.length == 1) {
			try {
				int[] data;
				File file = new File(args[0]);
				Scanner in = new Scanner(file);

				int sample_size = in.nextInt();   // The size of the data is the first number in each file
				
				if(sample_size != -1){
					data = new int[sample_size];  // Create the data array
					
					int i = 0;
					while (in.hasNextInt()) {
						data[i] = in.nextInt();
						i++;
					}
					
					MergeSort m = new MergeSort();
					QuickSort q = new QuickSort();
					//Heapsort h = new HeapSort();
					System.out.println(Arrays.toString(data));
					
					long startTime = System.nanoTime(); // Start the timing!
					
					//m.mergeSort(data);
					//q.quicksort(data, 0, data.length);
					
					long endTime = System.nanoTime(); // Finish the timing!

					long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds
					
					System.out.println(Arrays.toString(data) + "Duration: " + duration);
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
	   	}
		else {
			System.out.println("At least one file name needed.");
		}
	}
	
}
