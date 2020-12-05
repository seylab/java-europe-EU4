package day_08_controlFlowStatement_Part2;

import java.util.Scanner;

public class task33_Grading {

	public static void main(String[] args) {
		/*Write a Java Program for the following logic:
		 *  if marks < 60, then print “Fail”
		 *  if marks >= 60, but less than 90, then print “Pass”
		 *  if marks >= 90, then print “Passed with Distinction”
		 * */
		Scanner input =new Scanner(System.in);
		System.out.println("Enter your score");
		int mark= input.nextInt();
		input.close();
		if(mark<60) {
			System.out.println("Fail");
		}else if(mark>=60 && mark<90) {
			System.out.println("Pass");
		}else if(mark>=90&&mark<=100) {
			System.out.println("Passed with Distinction");
		}else {
			System.out.println("Invalid Score");
		}
	}

}
