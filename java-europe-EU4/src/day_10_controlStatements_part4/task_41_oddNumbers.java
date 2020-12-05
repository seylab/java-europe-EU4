package day_10_controlStatements_part4;

public class task_41_oddNumbers {

	public static void main(String[] args) {
		
//		Write a program that displays all odd numbers between 5-140 in same line
		
		for(int i=5;i<=140;i++) {
			if(i%2==1) {
				System.out.print(i+ " ");
			}
		}

	}

}
