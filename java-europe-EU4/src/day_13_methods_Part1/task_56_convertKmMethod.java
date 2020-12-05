package day_13_methods_Part1;

import java.util.Scanner;

public class task_56_convertKmMethod {

	public static void main(String[] args) {
		
		convertKM();
		
	}

	public static void convertKM() {
		double mile, km;
		Scanner scan= new Scanner(System.in);
		System.out.print("Please Enter mile: ");
		mile=scan.nextDouble();
		scan.close();
		km=mile*1.609344;
		System.out.println(mile + " mile is equal to " + km +" km");
	}

}
