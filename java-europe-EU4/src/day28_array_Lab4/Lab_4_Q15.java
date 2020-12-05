package day28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q15 {
//Write a method that accepts an array and swap the first and last element in the
// array. Print the modified array

	public static void main(String[] args) {
		int[] x = {1,2,3,4};// = > [4,2,3,1]
		int[] y = {1,2,3};// = > [3,2,1]
		int[] z = {8,6,7,9,5};// = > [5,6,7,9,8]
		
		System.out.println(Arrays.toString(firstSwapLast(x)));
		System.out.println(Arrays.toString(firstSwapLast(y)));
		System.out.println(Arrays.toString(firstSwapLast(z)));
		
	}
	public static int[] firstSwapLast(int[] arr) {
		int x=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1] = x;
		
		return arr;
		
	}
	
	
	
	
	
	
	
	
	

}
