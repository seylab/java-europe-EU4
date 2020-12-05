package day_11_controlStatement_part5;

public class task_53_sumOfEvenNumbers {

	public static void main(String[] args) {

		int i = 1;
		int sumEven = 0;
		
		while (i <= 98) {
			
			if (i % 2 == 0) {
				
				sumEven += i;
			}
			
			i++;
		}
		System.out.println(sumEven);
	}

}
