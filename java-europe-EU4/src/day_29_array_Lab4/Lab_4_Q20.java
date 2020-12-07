package day_29_array_Lab4;

public class Lab_4_Q20 {
//Write a method that accepts an array and prints true if the array contains a 2 next to a 2somewhere.

	public static void main(String[] args) {

		int[] x = { 1, 2, 2 };// = > true
		int[] y = { 1, 2, 1, 2 };// = > false
		int[] a = { 2, 1, 2 };// = > false
		int[] b = { 2, 2, 1, 2 };// = > true
		System.out.println(twiceTwoNextTo(x));
		System.out.println(twiceTwoNextTo(y));
		System.out.println(twiceTwoNextTo(a));
		System.out.println(twiceTwoNextTo(b));
	}

	public static boolean twiceTwoNextTo(int[] arr) {
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == 2 && arr[i + 1] == 2) {
				flag = true;
				break;
			}
		}

//		if(flag) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}

		return flag;
	}

}
