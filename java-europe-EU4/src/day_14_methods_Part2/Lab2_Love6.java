package day_14_methods_Part2;

import java.util.Scanner;

public class Lab2_Love6 {
	public static void main(String[] args) {
		int x, y;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter first your number: ");
		x = scan.nextInt();
		System.out.println("please enter first your number: ");
		y = scan.nextInt();
		scan.close();
		love6(x, y);

	}

	public static void love6(int x, int y) {

		if (x % 6 == 0 || y % 6 == 0 || (x + y) % 6 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
