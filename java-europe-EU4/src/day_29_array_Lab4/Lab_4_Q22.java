package day_29_array_Lab4;

public class Lab_4_Q22 {
//	Write a method that accepts an array and prints true if the number 1's is greater
//	than the number 4's
	public static void main(String[] args) {
		
	int[] x = {1,4,1};// = > true
	int[] x1 = {1,4,1,4};// = > false
	int[] x2 = {1,1};// = > true
	
	System.out.println(numberOfOne(x));
	System.out.println(numberOfOne(x1));
	System.out.println(numberOfOne(x2));
	
	}
	public static boolean numberOfOne(int[] arr) {
		int num1=0;
		int num4=0;
		 for (int i : arr) {
			if (i==1) {
				num1++;
			}
			if (i==4) {
				num4++;
			}
		}
		
		if(num1>num4) {
			return true;
		}else {
			return false;
		}
		
	}
}
