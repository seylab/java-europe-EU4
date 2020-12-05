package day_22_stringManipulation_Lab;

public class lab_3_Q07 {

	public static void main(String[] args) {
		// Q-7
		
		comboString("mehmet", "olgun");
	}
	public static void comboString(String str1, String str2) {
		int num1 = str1.length();
		int num2 = str2.length();
		if (num1 > num2) {
			System.out.println(str2 + str1 + str2);
		} else if (num2 > num1) {
			System.out.println(str1 + str2 + str1);
		} else {
			System.out.println("The vocabulary of words are equal");
		}
	}
}
