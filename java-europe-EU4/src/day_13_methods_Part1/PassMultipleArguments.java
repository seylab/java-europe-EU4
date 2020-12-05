package day_13_methods_Part1;

public class PassMultipleArguments {

	public static void main(String[] args) {

		showSum(5, 20);
		showSum(25, 250);
		showSum(12,75);
		
	}

	public static void showSum(int num1, double num2) {
		System.out.println(num1+num2);
	}
}
