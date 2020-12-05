package day_15_methods_Part3;

public class Task_69_PrimeNumbers {
	public static void main(String[] args) {
		/*
		 * Write a method named isPrime which takes an integer as an argument and
		 * returns true if the argument is a prime number, or false otherwise.
		 */

		boolean a = isPrime(99);
		System.out.println(a);

	}

	public static boolean isPrime(int x) {
		boolean flag = true;
		if (x != 0 && x != 1 && x != 2 && x%2==1) {
			for (int i = 3; i < x; i++) {
				if (x % i == 0) {
					flag = false;
					System.out.println(x +" divided by: "+ i);
					break;
				}
			}
		} else if (x == 0 || x == 1) {
			flag = false;
		} else if (x == 2) {
			flag = true;
		}else {
			System.out.println(x +" divided by: 2 ");
			flag=false;
		}
		return flag;

	}
}
