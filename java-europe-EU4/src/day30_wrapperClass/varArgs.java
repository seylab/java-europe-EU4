package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		
		sum(2,4,5);
		sum(2,4,5,6,5,8,3);
		
		System.out.println(concat("Apple","Orange","123","Result"));
		
	}
	public static void sum(int... numbers) { //A varArgs parameter can take a variable number of arguments
		int sum = 0;
		for(int value : numbers) {
			sum+=value;
		}
	System.out.println(sum);
	}
	public static String concat(String... strs) {
		
		String newStr = "";
		for(String str : strs) {
			
			newStr = newStr + str.charAt(2);
		}
		
		return newStr;
		
	}
}
