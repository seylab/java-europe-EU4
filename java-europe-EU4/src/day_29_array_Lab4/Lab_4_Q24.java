package day_29_array_Lab4;

public class Lab_4_Q24 {
/*	A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
	least one of the pair is that value.
	Write a method that accepts an array and a number, and prints true if the given number
	is everywhere in the array.
	int[] x = {1, 2, 1, 3};
	int a = 2; Output: false
	int[] x = {1, 2, 1, 3};
	int a = 1; 	Output: true
*/
	public static void main(String[] args) {
		int[] x = {1, 2, 1, 3};
		int a = 2;
		int[] x1 = {1, 2, 1, 3};
		int a1 = 1;
		System.out.println(isEverywhere(x, a));
		System.out.println(isEverywhere(x1, a1));
		
		
	}
	public static boolean isEverywhere(int[] arr, int number) {
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i] == number && (arr[i+1]== number || arr[i+2] == number)) {
				return true;
			}
		}
		
		
		return false;
	}
	
}
