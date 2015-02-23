import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class QuicksortTest {
	
	@Test
	public void testSwap() {
		Quicksort quicksort = new Quicksort();
		int[] data = {1, 2};
		int[] expected = {2,1};
		
		quicksort.swap(data, 0, 1);
		assertArrayEquals(data, expected);
	}
	

	@Test
	public void testIsSorted() {
		Quicksort quicksort = new Quicksort();
		int[] unsorted = RandomArray.generateRandom(2);
		int[] output = new int[10];
		
		output = quicksort.quicksort(unsorted, 0, unsorted.length);
		System.out.println(Arrays.toString(output));
		
		for(int i = 0; i < output.length; i++) {
			if(output[i] > output[i+1]) {
			  fail("Unordered list");	
			}
		}
	}
}