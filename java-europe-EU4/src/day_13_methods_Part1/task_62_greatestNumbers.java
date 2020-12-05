package day_13_methods_Part1;

public class task_62_greatestNumbers {

	public static void main(String[] args) {
		
		greatestNumber(10,15,95);

	}
	public static void greatestNumber (int a, int b, int c){
		if (a>b && a>c) {
			System.out.println(a +" = greatest number");
		}else if (b>c) {
			System.out.println(b +" = greatest number");
		}else{
			System.out.println(c +" = greatest number");
		}
	
	}
	
}
