package day_14_methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {
		 sum(2,3);
		int new1= sum(2, 3);
		System.out.println(new1);
	}
	
	public static int sum(int num1, int num2) {
		int result;
		result = num1+ num2;
		return result;
	}

}
