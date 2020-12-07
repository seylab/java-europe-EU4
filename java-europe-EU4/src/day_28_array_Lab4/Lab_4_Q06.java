package day_28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q06 {

	public static void main(String[] args) {
		int[] x = {1,2,3};//= > [3,3,3]
		int[] y = {11,5,9};// = > [11,11,11]
		int[] a = {110,5,98,0,1200,11,-4};// = > [1200,1200,1200,1200,1200,1200,1200]
		
		System.out.println(Arrays.toString(largestEl(x)));
		System.out.println(Arrays.toString(largestEl(y)));
		System.out.println(Arrays.toString(largestEl(a)));
		
	}public static int[] largestEl(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[arr.length-1];
		}
		return arr;
	}

}
