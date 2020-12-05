package day_14_methods_Part2;

import java.util.Scanner;

public class Lab4_DeerPlay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Is it summer?");
		boolean y = scan.nextBoolean();
		System.out.println("please enter temperature: ");
		int x = scan.nextInt();
		scan.close();

		deerPlay(x, y);

	}

	public static void deerPlay(int x, boolean y) {
		if (y == false && (x > 60 && x < 100)) {
			System.out.println(true);
		} else if (y == true && (x > 60 && x < 90)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
