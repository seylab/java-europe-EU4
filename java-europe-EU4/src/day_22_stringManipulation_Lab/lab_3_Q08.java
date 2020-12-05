package day_22_stringManipulation_Lab;

public class lab_3_Q08 {

	public static void main(String[] args) {
		// Q-8
		
		left2("Mehmet");

	}
	public static void left2(String str) {
		int num = str.length();
		String left2 = str.substring(2) + str.substring(0, 2);
		if (num > 2) {
			System.out.println(left2);
		} else {
			System.out.println(str);
		}
	}
}
