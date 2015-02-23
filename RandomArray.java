// This is a starter for the sorting project. Will create an 
// array of ARRAY_SIZE number of random numbers.
//
// Created by: 
// Sasha Fahrenkopf, Mark Kirby and Chris Monk
//

import java.util.Random; 
import java.util.Arrays;

class RandomArray {
  //public static final int ARRAY_SIZE = 10;
  //public static final int RANINT_MAX = 50;

  public static int[] generateRandom(int array_size) {
    int[] data = new int[array_size];
    Random random = new Random();
    
    for (int i = 0; i < array_size; ++i) {
      data[i] = random.nextInt(array_size);   
    }
	return data;
  }
}
