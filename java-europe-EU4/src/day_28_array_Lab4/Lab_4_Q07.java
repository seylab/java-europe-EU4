package day_28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q07 {
	public static void main(String[] args) {
/*Write a method that accepts 2 arrays and prints the second array containing 
the  first and last elements from the first array.
int[] x = {1,2,3};
int[] y = {}; = > [1,3]
int[] a = {7,4,6,2};
int[] b = {}; = > [7,2]
		 */
		int[] x = {1,2,3};
		int[] y = {};
		int[] a = {7,4,6,2};
		int[] b = {};
		System.out.println(Arrays.toString(makeEnd(x,y)));
		System.out.println(Arrays.toString(makeEnd(a,b)));
		
	}
	public static int[] makeEnd(int[] arr1, int[] arr2) {
		arr2 = new int[2];
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
		return arr2;
		
	}

}
