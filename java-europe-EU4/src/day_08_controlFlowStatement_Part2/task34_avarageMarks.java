package day_08_controlFlowStatement_Part2;

public class task34_avarageMarks {

	public static void main(String[] args) {
		// The marks obtained by a student in 3 different subjects are input by the user.
		// Your program should calculate the average of subjects.
		
		int a,b,c;
		a=50;
		b=79;
		c=91;
		double av=(a+b+c)/3;
		System.out.println("Average is : " + av);
		if(av>=90 && av<=100) {
			System.out.println("Grade is A");
		}else if(av>=80 && av<=89) {
			System.out.println("Grade is B");
		}else if(av>=70 && av<=79) {
			System.out.println("Grade is C");
		}else if(av>=60 && av<=69) {
			System.out.println("Grade is D");
		}else if(av>=0 && av<=59) {
			System.out.println("Grade is F");
		}else {
			System.out.println("Not valid value");
		}

	}

}
