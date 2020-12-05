package day_13_methods_Part1;

public class task_63_printPattern {

	public static void main(String[] args) {
		printPattern(5);

	}
	public static void printPattern(int a){
		for (int i=1;i<=a ;i++ ) {
			for (int k=1;k<=i ;k++ ) {
				System.out.print("*");
			}
			System.out.println();
	
	}

}
}
