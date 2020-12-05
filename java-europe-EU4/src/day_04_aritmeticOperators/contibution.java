package day_04_aritmeticOperators;

public class contibution {

	public static void main(String[] args) {

		/* this program calculate the amount of pay that will be contributed to 
		   a retirement plan if 5%, 8% or 10% monthly pay is withheld */

		double wit5,wit8,wit10,totalpay,netpay5,netpay8,netpay10;
		totalpay=10000;		
		wit5=0.05;
		wit8=0.08;
		wit10=0.1;
		
		netpay5=(totalpay*wit5);
		netpay8=(totalpay*wit8);
		netpay10=(totalpay*wit10);
		
		System.out.println("5%  is: $ " + netpay5 + "  per month.");
		System.out.println("8%  is: $ " + netpay8 + "  per month.");
		System.out.println("10% is: $ " + netpay10 + " per month.");
		
		
				
	}

}
