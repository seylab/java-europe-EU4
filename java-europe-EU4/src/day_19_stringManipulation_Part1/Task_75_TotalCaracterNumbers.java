package day_19_stringManipulation_Part1;

import java.util.Scanner;

public class Task_75_TotalCaracterNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Plase enter your first name.");
		String firstName = scan.next();
		System.out.println("Plase enter your Surname.");
		String surName= scan.next();
		scan.close();
		System.out.print("Character of Your name: ");
		System.out.println(firstName.length()+surName.length());
		
		
		

	}

}
