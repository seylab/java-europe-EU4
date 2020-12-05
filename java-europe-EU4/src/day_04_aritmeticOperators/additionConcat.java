package day_04_aritmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
		//Number + Number =Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//number + String : Concatenation
		System.out.println(5 + " hello");
		
		//String + Boolean : Concatenation
		System.out.println("hello" +true);
		
		//String+String : Concectenation
		System.out.println("hello"+"world");
				
	    //Boolean +Number
		//System.out.println(true+1);
		
		System.out.println(2+0+3+" Cybertek"); //5 Cybertek
		System.out.println("Cyberte"+2+0+5); // Cybertek205
		System.out.println(2+0+5+" Cybetek"+2+0+5); // 7 Cybertek205
		System.out.println(2+0+5+" Cybertek"+(2+0+1)); // 7 Cybertek2

		

	}

}
