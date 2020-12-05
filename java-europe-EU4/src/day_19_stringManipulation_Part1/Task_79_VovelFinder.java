package day_19_stringManipulation_Part1;

public class Task_79_VovelFinder {

	public static void main(String[] args) {
//		Write a program to print only vowel (a,e,o,i,u) in given string
		String word = "CybertekSchool";
//		Output: e,e,o,o

		for (int i = 0; i < word.length(); i++) {
			
			char vowel = word.charAt(i);
			
			if (vowel == 'a' || vowel == 'e' || vowel == 'o' || vowel == 'i' || vowel == 'u') {
				
				System.out.print(word.charAt(i));
				
				if (i != word.length() - 2) {

					System.out.print(",");
					
				}
			}

		}

	}

}
