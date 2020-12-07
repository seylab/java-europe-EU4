package day_28_array_Lab4;

import java.util.Arrays;

public class Lab_4_Q13 {
//Write a method that accepts 2 arrays and consider the sum of the values in each array.
//Print the array which has the largest sum. In event of a tie, print "equal"
	public static void main(String[] args) {
		
		int[] x = {1,2}; 
		int[] y = {3,4};// = > [3,4]
		largeSum(x, y);
		int[] x1 = {5,6}; 
		int[] y1 = {3,8};// = > equal
		largeSum(x1, y1);
		int[] x2 = {1,1}; 
		int[] y2 = {1,0};// = > [1,1]
		largeSum(x2, y2);
	}
	public static void largeSum(int[] arr1, int[] arr2) {
		int sum1=0;
		int sum2=0;
		
		for(int value1:arr1) {
			sum1+=value1;
		}
		for(int value2:arr2) {
			sum2+=value2;
		}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}else {
			System.out.println("equal");
		}
		
	}

	
	
	
	
	
	
	
	
	
	
}
