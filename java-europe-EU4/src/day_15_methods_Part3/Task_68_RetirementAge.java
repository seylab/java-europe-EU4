package day_15_methods_Part3;

public class Task_68_RetirementAge {
	public static void main(String[] args) {
	/*	Write two methods:
	1-calculateAge(yearBirth); and returns the age
	2-yearsUntilRetirement(name,year); and displays in the console following: 
	“Mike retires 	in 36 years”
	Example: yearsUntilRetirement(“Mike”,1990);
		*/
		calculateAge(1985);
		int age=calculateAge(1990);
		yearsUntilRetirement("Mike", age);
		
	}

	public static void yearsUntilRetirement(String name, int age) {
		
		System.out.println(name + " retires in " + (65-age)+ " years");
		
	}

	public static int calculateAge(int yearBirth) {
		int age=2020-yearBirth;
		return age;
		
		
	}
	

}
