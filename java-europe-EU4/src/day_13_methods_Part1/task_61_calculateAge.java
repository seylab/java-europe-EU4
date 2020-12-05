package day_13_methods_Part1;



public class task_61_calculateAge {

	public static void main(String[] args) {
		calculateAge(2005);
		

	}

	public static void calculateAge(int year ) {
		int today=2020;
		int age=today-year;
		if(age>0&&age>18) {
		System.out.println("calculateAge("+year+")"+age+"> "+18);
		}else if(age>0&&age<18) {
			System.out.println("calculateAge("+year+")"+age+"< "+18);
			}
		
	}

}
