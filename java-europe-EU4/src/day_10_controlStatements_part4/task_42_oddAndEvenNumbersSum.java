package day_10_controlStatements_part4;

public class task_42_oddAndEvenNumbersSum {

	public static void main(String[] args) {
//		Write a program that displays sum of even and odd numbers between 1 and 100
//		excluding 100
//		
		int odd=0;
		int even=0;
//		for(int i=1;i<=99;i+=2) {
//			odd+=i;
//		}
//		System.out.println("Sum of odd numbers = "+odd);
//		
//		for(int i=2; i<=98; i+=2) {
//			even+=i;
//		}System.out.println("Sum f even Numbers = "+even);
		
		for(int i=1;i<100;i++) {
			if(i%2==0) {
			even+=i;	
			}else {
			odd+=i;
			}
		}
	
		System.out.println("Sum f even Numbers = "+even);
		System.out.println("Sum of odd numbers = "+odd);
		
	}

}
