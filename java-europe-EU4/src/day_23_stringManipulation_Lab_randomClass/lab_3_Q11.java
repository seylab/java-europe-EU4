package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q11 {
/* Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho")  1
countHi("ABChi hi")  2
countHi("hihi")  2
*/
	public static void main(String[] args) {
		
		String str = "abc hi ho hihi";
		
		int counter=0;
		
		for (int i = 0; i < str.length()-1; i++) {
			
			if (str.substring(i, i+2).equals("hi")) {
				
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
