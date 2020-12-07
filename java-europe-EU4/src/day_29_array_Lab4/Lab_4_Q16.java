package day_29_array_Lab4;

public class Lab_4_Q16 {
//Write a method that accepts an array and prints the number of even numbers in the array.

	public static void main(String[] args) {
		int[] x = {2,1,2,3,4}; // = > 3
		int[] y = {2,2,0}; // = > 3
		int[] z = {1,3,5}; // = > 0
		System.out.println(arrayNums(x));
		System.out.println(arrayNums(y));
		System.out.println(arrayNums(z));
	}
	public static int arrayNums(int[] arr) {
		int counter=0;
		for(int value:arr) {
			if (value%2==0) {
				counter++;
			}
		}
		return counter;
	}

}
