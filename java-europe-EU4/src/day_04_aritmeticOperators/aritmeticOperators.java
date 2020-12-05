package day_04_aritmeticOperators;

public class aritmeticOperators {

	public static void main(String[] args) {
		
		//Addition Operator +
		System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		chairs=chairs+2;
						
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		//subtraction -
		double balance=1200.50;
		double transaction= 56.44;
		System.out.println(balance- transaction);
		balance=balance-transaction;
		System.out.println(balance);
		//create a variable linesOfCode and assign 50 and print " Lines of code 50"
		//delete 2 lines
		//decrease the vale of lineOfCode by 2 and print " Lines of code 48"
		int linesOfCode=50;
		System.out.println(" Lines of code "+ linesOfCode);
		
		linesOfCode=linesOfCode-2;
		System.out.println(" Lines of code " + linesOfCode);
		
		//multiplication *
		System.out.println(22*2);
		
		int clases =5;
		System.out.println(linesOfCode*clases);
		int totalLinesOfCode=linesOfCode*clases;
		System.out.println("Total Lines of Codes = "+ totalLinesOfCode);
		
		//Division
		System.out.println(10/2);
		System.out.println(60/3);
		System.out.println(11/2);
		
		//System.out.println(11/0);//throw error while running the code
		
		// Reminder %
		System.out.println(10%2);
		System.out.println(9%2);
		

	}

}
