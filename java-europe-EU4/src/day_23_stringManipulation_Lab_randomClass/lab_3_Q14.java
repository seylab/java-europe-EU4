package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q14 {
//Given a string, return true if it ends in "ly".
	public static void main(String[] args) {
		
		String str = "oddly";

		
		if (str.length()<2) {
			System.out.println(false);
			return;
		}
		if (str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
	}
}
