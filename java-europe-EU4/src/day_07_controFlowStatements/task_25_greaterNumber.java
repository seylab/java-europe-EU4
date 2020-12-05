package day_07_controFlowStatements;

public class task_25_greaterNumber {

	public static void main(String[] args) {
		
		int a,b,c;
		a=4;
		b=8;
		c=1;
		
		if(a>b && a>c) {
			System.out.println(a + " is the greatest number");
		}
		if (b>a && b>c) {
			System.out.println(b + " is the greatest number");
		}
		if (c>a && c>b ) {
			System.out.println(c +" is the greatest number");
		}

	}

}
