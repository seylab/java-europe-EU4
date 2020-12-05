package day_22_stringManipulation_Lab;

public class lab_3_Q03 {

	public static void main(String[] args) {
		// Q-3
		extraEnd("apple");
		
	}
	public static void extraEnd(String str) {
		String a=str.substring(str.length()-2);
		System.out.println(a+a+a);
		
	}
}
