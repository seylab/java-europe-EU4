package day_14_methods_Part2;

import java.util.Scanner;

public class Lab5_CaugthSpeeding {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Today is your Birthday? True or false");
		boolean birthday = scan.nextBoolean();
		System.out.println("Please enter Speed: ");
		int speed = scan.nextInt();
		scan.close();
		caugthSpeeding(speed, birthday);
	}

	public static void caugthSpeeding(int speed, boolean birthday) {
		if (birthday == true) {
			if (speed <= 65) {
				System.out.println("0 = no ticket");
			} else if (speed <= 85) {
				System.out.println("1 = small ticket");
			} else {
				System.out.println("2 = big ticket");
			}

		} else if (birthday != true) {
			if (speed <= 60) {
				System.out.println("0 = no ticket");
			} else if (speed <= 80) {
				System.out.println("1 = small ticket");
			} else {
				System.out.println("2 = big ticket");
			}
		}
	}
}
