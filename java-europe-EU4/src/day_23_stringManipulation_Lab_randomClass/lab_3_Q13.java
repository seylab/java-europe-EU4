package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q13 {
//Given a string, return a string where for every char in the original, there are two chars.
	public static void main(String[] args) {

		String str = "the"; // => tthhee
		String dStr = "";
		for (int i = 0; i < str.length(); i++) {
			dStr = dStr + str.substring(i, i + 1).concat(str.substring(i, i + 1));
		}
		System.out.println(dStr);
	}
}
