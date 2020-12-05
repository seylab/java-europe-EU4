package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q12 {
//	Return true if the string "cat" and "dog" appear the same number of times in the given string.
	public static void main(String[] args) {
		String str= "catdog";
		
		boolean flag= false;
		int counterdog=0;
		int countercat=0;
		for (int i = 0; i < str.length()-2; i++) {
			 if (str.substring(i, i+3).equals("cat")) {
				 countercat++;
			}
			 if(str.substring(i, i+3).equals("dog")) {
				counterdog++;
			}
			
		}
		if (countercat == counterdog) {
			flag=true;
		}
		
		System.out.println(flag);
	}

}
