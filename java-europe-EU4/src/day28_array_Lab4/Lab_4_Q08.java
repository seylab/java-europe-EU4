package day28_array_Lab4;

public class Lab_4_Q08 {
	/*Write a method that accepts an array and prints true if it contains a 2 or a 3
	int[] x = {2,5}; = > true
	int[] y = {4,3}; = > true
	int[] z = {4,5}; = > false
	*/
	public static void main(String[] args) {
		
		int[] x = {2,5}; 
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(containArr(x));
		System.out.println(containArr(y));
		System.out.println(containArr(z));
	}
	public static boolean containArr(int[] arr) {
		for(int value:arr) {
			if(value==2 || value==3) {
				return true;
			}
			}
		
		return false;
	}
		
}
