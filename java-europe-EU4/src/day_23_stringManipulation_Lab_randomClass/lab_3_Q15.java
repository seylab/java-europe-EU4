package day_23_stringManipulation_Lab_randomClass;

public class lab_3_Q15 {
/*Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. */
	public static void main(String[] args) {
		
		String str="badabscsf";
		
		boolean flag= true;
		for (int i = 0; i < 2; i++) {
			if (str.substring(i, i+3).equals("bad")) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		System.out.println(flag);
	}
}
