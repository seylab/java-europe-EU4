package day_19_stringManipulation_Part1;

public class String_ChartAt {

	public static void main(String[] args) {

		
		String word = "computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		// Check if first Character is 'A'
		String word2 = "Apple";
		if (word2.charAt(0)=='A') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		// Check if first and last Characters are same.
		String word3 = "civic";
		 if (word3.charAt(0)==word3.charAt(4)) {
			System.out.println("first and last Characters are same.");
		} else {
			System.out.println("first and last Characters are not same.");
		}
		
		 System.out.println();
		 //last index not hard coded.
		 
		String word4 = "Java";
		
		char lastChar = word4.charAt(word4.length()-1);
		
		System.out.println("Last char of " + word4 + " is (" + lastChar+")");
	}

}
