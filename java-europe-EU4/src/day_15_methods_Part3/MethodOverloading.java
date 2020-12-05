package day_15_methods_Part3;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(sum(2,5,9));
		
		int x= sum(11, 22, 33, 44);
		System.out.println(x);
		
		
	}
	public static int sum(int a, int b ) {
		return a+b;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}
