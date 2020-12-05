package day_22_stringManipulation_Lab;

public class lab_3_Q04 {

	public static void main(String[] args) {
		// Q-4
		firstTwo("");

	}

	public static void firstTwo(String str) {
		int num = str.length();
		if (num >= 2) {
			String a = str.substring(0, 2);
			System.out.println(a);
		} else {
			System.out.println(str);
		}
	}
}
