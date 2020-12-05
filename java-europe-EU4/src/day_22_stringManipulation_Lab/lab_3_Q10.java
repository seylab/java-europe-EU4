package day_22_stringManipulation_Lab;

public class lab_3_Q10 {
	
	public static void main(String[] args) {
		// Q-10
		frontAgain("mehmet");
		frontAgain("mehme");
		frontAgain("me");
		frontAgain("m");

	}
	public static void frontAgain(String str) {
		int num = str.length();
		if (num >= 2) {
			String first2 = str.substring(0, 2);
			String last2 = str.substring(num - 2);
			if (first2.equals(last2)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {

			System.out.println(false);
		}
	}
}
