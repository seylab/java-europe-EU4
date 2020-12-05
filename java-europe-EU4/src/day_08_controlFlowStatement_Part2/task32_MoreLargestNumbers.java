package day_08_controlFlowStatement_Part2;

public class task32_MoreLargestNumbers {

	public static void main(String[] args) {
		
		//• Declare 3 numbers
		//• Program should display which one is largest 
		
		int a,b,c;
		a=21;
		b=3;
		c=10;
		if (a>b && a>c) {
			System.out.println("The largest number is : " + "a = " + a);
		}else if(b>a && b>c) {
			System.out.println("The largest number is : " + "b = " + b);
		}else if(c>a && c>b) {
			System.out.println("The largest number is : " + "c = " + c);
		}else {
		System.out.println("The all or two numbers are equal " );
		}

	}

}
