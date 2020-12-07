package day_28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q11 {
	/*Write a method that accepts an array, and if there is a 2 in the array 
immediately followed by a 3, set the 3 element to 0. Print the changed Array
int[] x = {1,2,3} = > [1,2,0]
int[] x = {2,3,5} = > [2,0,5]
int[] x = {1,2,1} = > [1,2,1]
int[] x = {11,2,13,3,2} = > [11,2,13,3,2]                               	 */
	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] x1 = {2,3,5};
		int[] x2 = {1,2,1};
		int[] x3 = {11,2,13,3,2};
		
		System.out.println(Arrays.toString(find23(x)));
		System.out.println(Arrays.toString(find23(x1)));
		System.out.println(Arrays.toString(find23(x2)));
		System.out.println(Arrays.toString(find23(x3)));
	}
	public static int[] find23(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
//			if(arr[arr.length-1]==2) {
//				return arr;
//			}else 
				if (arr[i]==2 && arr[i+1]==3) {
				
				arr[i+1] = 0;
			}
		}
		return arr;
	}
	
	
	
}
