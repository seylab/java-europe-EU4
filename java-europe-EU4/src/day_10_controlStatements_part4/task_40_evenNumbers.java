package day_10_controlStatements_part4;

public class task_40_evenNumbers {

	public static void main(String[] args) {
		
//		Write a program that displays all even numbers between 1-100 in same line
		
		for(int i=2;i<=100;i+=2) {
			System.out.print(i);
		}
		System.out.println();
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}

	}

}
