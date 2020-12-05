package day28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q09 {
	/*
	 * Write a method that accepts an array and prints a new array with double the
	 * length where its last element is the same as the original array, 
	 * int[] x = {4,5,6}; = > [0,0,0,0,0,6]
	 */

	public static void main(String[] args) {
		int[] x = { 4, 5, 6 };
		int[] y = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

		System.out.println(Arrays.toString(doubleArr(x)));
		System.out.println(Arrays.toString(doubleArr(y)));
	}

	public static int[] doubleArr(int[] arr) {

		int[] arr2 = new int[arr.length * 2];
		arr2[arr2.length - 1] = arr[arr.length - 1];
		return arr2;

	}
}
