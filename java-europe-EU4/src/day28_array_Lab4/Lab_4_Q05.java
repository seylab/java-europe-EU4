package day28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q05 {
	public static void main(String[] args) {
		
	/*Write a method that accepts an array and prints an array with the elements 
	 "rotated left”
	 */
		int[] x = {1,2,3};
		int[] y = {17,12,10,8};
		int[] a = {7,0,0};
		
		System.out.println(Arrays.toString(elementsA(x)));
		System.out.println(Arrays.toString(elementsA(y)));
		System.out.println(Arrays.toString(elementsA(a)));
		
	}
	public static int[] elementsA(int[] arr) {
		
		int x= arr[0];
		
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1] = x;
		return arr;
	}

}
