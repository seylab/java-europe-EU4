package day_29_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q23 {
//	Write a method that accepts a number and create and prints a new array of length
//	number, containing the numbers 0,1,2,...number-1.
	
	public static void main(String[] args) {
		
	fizzArray(4);//  [0, 1, 2, 3]
	fizzArray(1);//  [0]
	fizzArray(10);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	
	System.out.println(Arrays.toString(fizzArray(4)));
	System.out.println(Arrays.toString(fizzArray(1)));
	System.out.println(Arrays.toString(fizzArray(10)));
	
	
	}
	public static int[] fizzArray(int x) {
		int[] array = new int[x];
		for (int i = 0; i < array.length; i++) {
			array[i]=i;
			
		}
		return array;
	}

}
