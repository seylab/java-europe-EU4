package day_15_methods_Part3;

public class Task_67_LastDigits {
/*	Write a method that accepts 2 numbers and 
 	return if they have the same last digit.
			Sample Output
			lastDigit(7,17) - >true
			lastDigit(6,17) - >false
			lastDigit(3,113) - >true
	*/
	public static void main(String[] args) {
		
		lastDigit(7,17);
		lastDigit(29, 59);
		boolean result1=lastDigit(6, 17);
		System.out.println(result1);
	}

	public static boolean lastDigit(int x, int y) {
		boolean result;
		if(y%10==x%10) {
			System.out.println(result=true);
		}else {
			System.out.println(result=false);
		}
		return result;
		
	}

}
