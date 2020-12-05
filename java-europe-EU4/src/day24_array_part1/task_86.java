package day24_array_part1;

import java.util.Scanner;

public class task_86 {

	public static void main(String[] args) {
		/* Create an array that holds 12 months names
		User should be able to enter month index and output should be:
		“The month name is <MonthName>”
		 */
		
		String[] month= new String[12];
		Scanner sc= new Scanner(System.in);
		month[0]="January";
		month[1]="February";
		month[2]="March";
		month[3]="April";
		month[4]="May";
		month[5]="June";
		month[6]="July";
		month[7]="August";
		month[8]="September";
		month[9]="October";
		month[10]="November";
		month[11]="December";
		
		System.out.print("Please enter your month number:");
		int x=sc.nextInt();
		
		
		System.out.println("The month name is <"+month[x-1]+ ">");
		
		
	}

}
