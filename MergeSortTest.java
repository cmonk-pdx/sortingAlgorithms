import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Random;
import org.junit.Test;

public class MergeSortTest {
	
	@Test
	public void testIsSorted() {
		MergeSort mergeSort = new MergeSort();
		int[] unsorted = RandomArray.generateRandom();
		int[] mergeOutput = new int[10];
		
		mergeOutput = mergeSort.mergeSort(unsorted);
		Arrays.sort(unsorted);
		assertArrayEquals(unsorted, mergeOutput);
	}
}