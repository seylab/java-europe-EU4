package day_19_stringManipulation_Part1;

public class Task_78_OccurenceNumber {

	public static void main(String[] args) {
		
//		Write a program to count the number of occurrences for specific char
		String word = "abcabqcabcaa";
//		Number of a in this string is: 3
		char occur='q';
		int number=0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)==occur) {
				number++;
								
			}
		}
		System.out.println("Number of " + occur + " in This string is:" + number);
		
		
		
	}

}
