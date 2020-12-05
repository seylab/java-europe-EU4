package day29_array_Lab4;

public class Lab_4_Q17 {
// Write a method that accepts an array and print the difference between the largest and
//smallest values in the array.

	public static void main(String[] args) {
		int[] x = { 10, 3, 5, 6 }; // = > 7
		int[] y = { 7, 2, 10, 9 }; // = > 8
		int[] z = { 2, 10, 7, 2, 25 }; // = > 8
		System.out.println(differenceEl(x));
		System.out.println(differenceEl(y));
		System.out.println(differenceEl(z));
	}

	public static int differenceEl(int[] arr) {
		int maxE = arr[0];
		int minE = arr[0];
		int difference;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxE) {
				maxE = arr[i];
			}
			if (arr[i] < minE) {
				minE = arr[i];
			}
		}
		difference = maxE - minE;
		return difference;
	}

}
