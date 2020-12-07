package day_29_array_Lab4;

public class Lab_4_Q18 {
//	Write a function that accepts an array and prints the sum of the numbers in the array. 
//	Except the number 13 is very unlucky, so it does not count and numbers that
//	come immediately after a 13 also do not count

	public static void main(String[] args) {
		int[] x = { 1, 2, 2, 1 };// = > 6
		int[] y = { 1, 1 };// = > 2
		int[] a = { 1, 2, 2, 1, 13 };// = > 6
		int[] b = { 13, 2, 2, 1, 13, 3 };// = > 6

		System.out.println(sumOfEl(x));
		System.out.println(sumOfEl(y));
		System.out.println(sumOfEl(a));
		System.out.println(sumOfEl(b));

	}

	public static int sumOfEl(int[] arr) {
		int sumEl = 0;
		for (int i : arr) {
			if (i != 13) {
				sumEl += i;
			} else {
				break;
			}
		}
		return sumEl;
	}

}
