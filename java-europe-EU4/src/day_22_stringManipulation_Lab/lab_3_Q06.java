package day_22_stringManipulation_Lab;

public class lab_3_Q06 {

	public static void main(String[] args) {
		// Q-6
		
		withoutEnd("mehmet");
	}
	public static void withoutEnd(String str) {
		int num = str.length();
		String withoutEnd = str.substring(1, num-1);
		System.out.println(withoutEnd);
	}
}
