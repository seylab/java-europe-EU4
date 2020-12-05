package day_14_methods_Part2;

public class Lab1_StringTimes {

	public static void main(String[] args) {
		stringTimes("Hi", 5);
	}

	public static void stringTimes(String a, int x) {
		for (int i = 0; i < x; i++) {
			System.out.print(a);
		}
	}

}
