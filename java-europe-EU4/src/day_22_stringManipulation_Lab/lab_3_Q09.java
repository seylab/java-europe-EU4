package day_22_stringManipulation_Lab;

public class lab_3_Q09 {

	public static void main(String[] args) {
		// Q-9
		
		right2("Mehmet");

	}
	public static void right2(String str) {
		int length = str.length();
		if (length > 2) {
			String last2 = str.substring(length - 2);
			String right2 = last2 + str.substring(0, length - 2);
			System.out.println(right2);
		} else {
			System.out.println(str);
		}
	}
}
