package day_11_controlStatement_part5;

public class nestedForLoop {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Outer Loop Iteration "+i);
			for(int j=1;j<=5;j++) {
				System.out.println("i= "+ i + "; j = "+j);
			}
		}
	}

}
