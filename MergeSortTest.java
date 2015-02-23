import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void testIsSorted() {
		MergeSort mergeSort = new MergeSort();
		int[] unsorted = RandomArray.generateRandom(10);
		int[] output = new int[10];
		
		output = mergeSort.mergeSort(unsorted);
		//System.out.println(Arrays.toString(output));
		
		for(int i = 0; i > output.length; i++) {
			if(output[i] > output[i+1]) {
			  fail("Unordered list");	
			}
		}
	}
}