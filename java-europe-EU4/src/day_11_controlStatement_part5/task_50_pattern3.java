package day_11_controlStatement_part5;

public class task_50_pattern3 {

	public static void main(String[] args) {
//		Write a Java program to create pattern
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
		
		for (int i = 1; i <= 5; i++) {
			
			for (int p = 1; p <= i; p++) {
				System.out.print(p+" ");
				}
			System.out.println();
			}
		
	}

}
