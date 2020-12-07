package day_26_array_part3;

import java.util.Arrays;

public class Task_94_StringInfo {

	public static void main(String[] args) {
		
		String info1 = "This info is used for creation password : xxxCD132Gxxx . "
				+ "Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx ."
				+ " Please do not share with anyone";
//		Create a password based on given info.
//		Output: CD132G00ABC!
		
		String[] info1Array=info1.split("password :");
		String[] info2Array= info2.split("password :");
		
//		System.out.println(Arrays.toString(info1Array));
//		System.out.println(Arrays.toString(info2Array));
		
		String pass1=info1Array[1].split(". Please")[0];
		String pass2=info2Array[1].split(". Please")[0];
		
		pass1=pass1.trim();
		pass2=pass2.trim();
		
		pass1=pass1.substring(3, pass1.length()-3);
		pass2=pass2.substring(3, pass2.length()-3);
		
		System.out.println(pass1+pass2);
	}

}
