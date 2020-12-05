package day_08_controlFlowStatement_Part2;

public class task35_FindGreatestNumbersNested {

	public static void main(String[] args) {
		
		//find the greatest by using nested if
		
		int a,b,c;
		a=1000;
		b=100;
		c=10000;
		
		if(a>b && a>c) {
			System.out.println(" greatest is: a " + a);
		}else {
			if(b>c) {
				System.out.println(" greatest is: b " + b);
			}else {
				System.out.println(" greatest is: c  " + c);
			}
		}

	}

}
