import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class QuickSortTest {
	
	@Test
	public void testSwap() {
		QuickSort quicksort = new QuickSort();
		int[] data = {1, 2};
		int[] expected = {2,1};
		
		quicksort.swap(data, 0, 1);
		assertArrayEquals(data, expected);
	}
	

	@Test
	public void testIsSorted() {
		QuickSort quicksort = new QuickSort();
		int[] unsorted = RandomArray.generateRandom(2);

		/*
		quicksort.quicksort(unsorted, 0, unsorted.length);
		System.out.println(Arrays.toString(output));
		
		for(int i = 0; i < output.length; i++) {
			if(output[i] > output[i+1]) {
			  fail("Unordered list");	
			}
		}
		*/
	}
}