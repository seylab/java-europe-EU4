package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q17 {
// Write a method that accepts a string and returns true if the string is palindrome.
	public static void main(String[] args) {
		
		// String str = "madam";
		
		String str = "Taco cat";
		 
		String dummy="";
		
		for (int i = str.length()-1; i >= 0; i--) {
			
			dummy = dummy + str.charAt(i);
			
		}
		
		if (str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
