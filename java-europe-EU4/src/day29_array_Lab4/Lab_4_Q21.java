package day29_array_Lab4;

public class Lab_4_Q21 {
//Write a method that accepts an array and prints true if the sum of all 2's 
//in the array is exactly 8
	
	public static void main(String[] args) {

		int[] x = { 2, 3, 2, 2, 4, 2 }; // = > true
		int[] y = { 2, 3, 2, 2, 4, 2, 2 };// = > false
		int[] z = { 1, 2, 3, 4 }; // = > false

		System.out.println(sumOftwo8(x));
		System.out.println(sumOftwo8(y));
		System.out.println(sumOftwo8(z));

	}

	public static boolean sumOftwo8(int[] arr) {
		int sum = 0;
		boolean flag = false;
		for (int i : arr) {
			if (i == 2) {
				sum += i;
			}
		}
		if (sum == 8) {
			flag = true;
		}

		return flag;
	}
}
