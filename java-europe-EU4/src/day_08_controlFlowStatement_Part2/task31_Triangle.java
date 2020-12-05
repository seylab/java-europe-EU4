package day_08_controlFlowStatement_Part2;

public class task31_Triangle {

	public static void main(String[] args) {
		// A triangle is valid if the sum of all the three angles is 
		//equal to 180 degrees. 
		//Write a program that declares three integers as angles and 
		//check whether a triangle is valid or not.

		int a,b,c;
		a=60;
		b=60;
		c=60;
		
		if((a+b+c)==180) {
			System.out.println("Triangle is Valid");
		}else {
			System.out.println("Triangle is not Valid");
		}
	}

}
