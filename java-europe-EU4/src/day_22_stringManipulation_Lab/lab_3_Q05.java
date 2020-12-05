package day_22_stringManipulation_Lab;

public class lab_3_Q05 {

	public static void main(String[] args) {
		// Q-5
		firstHalf("mehmetolgun");

	}
	public static void firstHalf(String str) {
		int num = str.length();
		String firstHalf = str.substring(0, num / 2);
		System.out.println(firstHalf);

	}
}
