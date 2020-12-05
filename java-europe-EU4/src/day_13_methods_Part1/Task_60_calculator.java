package day_13_methods_Part1;

public class Task_60_calculator {

	public static void main(String[] args) {
		calculator(3, 5, "+");
		calculator(20, 5, "-");
		calculator(20, 5, "*");
		calculator(20, 5, "/");
		calculator2(3, 5, "+");
		calculator2(20, 5, "-");
		calculator2(20, 5, "*");
		calculator2(20, 5, "/");

	}

	public static void calculator(int num1, int num2, String operators) {
		if (operators.equals("+")) {
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 + num2));
		} else if (operators.equals("-")) {
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 - num2));
		} else if (operators.equals("*")) {
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 * num2));
		} else if (operators.equals("/")) {
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 / num2));
		}

	}

	public static void calculator2(int num1, int num2, String operators) {
		switch (operators) {
		case "+": 
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + " " + operators + " " + num2 + " = " + (num1 / num2));
			break;
		}
	}

}
