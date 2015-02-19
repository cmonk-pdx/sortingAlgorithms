import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testIsSorted() {
		  final int ARRAY_SIZE = 10;
		  final int RANINT_MAX = 50;
		  
		  int[] data = new int[ARRAY_SIZE];
		  Random random = new Random();
		    
		  for (int i = 0; i < ARRAY_SIZE; ++i) {
		    data[i] = random.nextInt(RANINT_MAX);   
		  }
		fail("Not yet implemented");
	}
}
