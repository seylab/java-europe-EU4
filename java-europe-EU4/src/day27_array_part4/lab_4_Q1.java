package day27_array_part4;

public class lab_4_Q1 {

	public static void main(String[] args) {
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		int[] k = {1};
		
		//calling the method
		System.out.println(firstLast6(x));
		System.out.println(firstLast6(y));
		System.out.println(firstLast6(z));
		System.out.println(firstLast6(k));
		

		
		
	}

	public static boolean firstLast6(int[] array) {
		if(array.length<1) {
			return false;
		}
		if(array[0] ==6 || array[array.length-1]==6) {
			return true;
		}else {
			return false;
		}
	}
	
}
	
