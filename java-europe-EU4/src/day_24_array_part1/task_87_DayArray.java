package day_24_array_part1;

import java.util.Scanner;

public class task_87_DayArray {

	public static void main(String[] args) {
		/*Create an array that holds the days
			User should be able to enter the day index and output should be:
			“Today is Monday”
		 */
		String[] dayOfWeek= new String[7];
		Scanner sc= new Scanner(System.in);
		dayOfWeek[0]="Monday";
		dayOfWeek[1]="Tuesday";
		dayOfWeek[2]="Wednesday";
		dayOfWeek[3]="Thursday";
		dayOfWeek[4]="Friday";
		dayOfWeek[5]="Saturday";
		dayOfWeek[6]="Sunday";
		System.out.print("Please enter your day index number:");
		int index=sc.nextInt();
		sc.close();
		System.out.println("Today is " + dayOfWeek[index-1]);
		
		

	}

}
