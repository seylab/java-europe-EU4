package day_29_array_Lab4;

public class Lab_4_Q19 {
	/*
	 * Write a method that accepts an array and prints the total of the numbers in
	 * the array, except ignore sections of numbers starting with a 6 and extending
	 * to the next 7 (every 6 will be followed by at least one 7).
	 */
	public static void main(String[] args) {

		int[] x = { 1, 2, 2 };// = > 5
		int[] y = { 1, 2, 2, 6, 99, 99, 7 };// = > 5
		int[] a = { 1, 1, 6, 7, 2 };// = > 4
		int[] b = { 1, 1, 6, 2 };// = > 2
		int[] c = { 1, 2, 2, 6, 99, 99, 7, 3, 4 };// = > 12

		System.out.println(totalElWithoutSixSeven(x));
		System.out.println(totalElWithoutSixSeven(y));
		System.out.println(totalElWithoutSixSeven(a));
		System.out.println(totalElWithoutSixSeven(b));
		System.out.println(totalElWithoutSixSeven(c));

	}

	public static int totalElWithoutSixSeven(int[] arr) {
		int totalEl = 0;
		boolean flag = false;
		for (int i : arr) {
			if (flag) {
				if (i == 7) {
					flag = false;
				}
			} else if (i == 6) {
				flag = true;
			} else {
				totalEl += i;
			}
		}

		return totalEl;
	}

}
