package day_08_controlFlowStatement_Part2;

public class task36_CalculaterWithSwicthCase {

	public static void main(String[] args) {
		
	
		int a,b;
		a=10;
		b=15;
		String operator="/";
		int result=0;
		
		switch(operator) {
		
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			result=a/b;
			break;
		default:
			System.out.println("Invalid Operator");
			
		
		}
		System.out.println("Result is " + result);
		
	}

}
