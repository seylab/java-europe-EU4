package day_14_methods_Part2;

import java.util.Scanner;

public class Lab3_SpecialEleven {
	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Number: ");
		x = scan.nextInt();
		scan.close();
		specialEleven(x);

	}

	public static void specialEleven(int x) {
		if (x % 11 == 0 || x % 11 == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
