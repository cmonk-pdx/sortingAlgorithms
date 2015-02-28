import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class HeapSortTest {

	@Test
	public void testIsSorted() {
		HeapSort heapsort = new HeapSort();
		int[] unsorted = RandomArray.generateRandom(2);

		/*
		HeapSort.HeapSort(unsorted, 0, unsorted.length);
		System.out.println(Arrays.toString(output));
		
		for(int i = 0; i < output.length; i++) {
			if(output[i] > output[i+1]) {
			  fail("Unordered list");	
			}
		}
		*/
	}
}