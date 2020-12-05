package day_14_methods_Part2;

import java.util.Scanner;

public class Lab6_ChipmonksParty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it weekend? True or false: ");
		boolean weekend = scan.nextBoolean();
		System.out.println("total cigarets number?");
		int cigars = scan.nextInt();
		scan.close();
		cigarParty(weekend, cigars);
	}

	public static void cigarParty(boolean weekend, int cigars) {
		if (weekend == true) {
			if (cigars > 40) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}

		} else if (weekend == false) {
			if (cigars > 40 && cigars > 60) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

	}
}
