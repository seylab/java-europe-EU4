package day28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q14 {
//Write a method that accepts 2 arrays and prints a new array containing all their
//elements
	public static void main(String[] args) {
		int[] x = {1,2};
		int[] y = {3,4};// = > [1,2,3,4]
		int[] x1 = {4,4};
		int[] y1 = {2,2};// = > [4,4,2,2]
		int[] x2 = {9,2}; 
		int[] y2 = {3,4};// = > [9,2,3,4]
		
		
		combineArr(x, y);
		combineArr(x1, y2);
		combineArr(x2, y2);
		
	}
	public static void combineArr(int[] arr1, int[] arr2) {
		
		int[]arr3= new int[arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			
			arr3[i]=arr1[i];
			
		}
		int a=0;
		for (int i = arr1.length; i < arr3.length; i++) {
			arr3[i]=arr2[a];
			a++;
		}
		System.out.println(Arrays.toString(arr3));
	//	return arr3;
	}

	
}
