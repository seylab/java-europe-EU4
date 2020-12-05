package day27_array_part4;

public class Lab_4_Q3 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = {7,3};
		
		int[] x1 = {1,2,3};
		int[] y1 = {7,3,2};
		
		int[] x2 = {1,2,3}; 
		int[] y2 = {1,3};
		
		int[] x3 = {1}; 
		int[] y3 = {7,3};
		
		int[] x4 = {1,2,3}; 
		int[] y4 = {1};
		
		System.out.println(moreLarge(x, y));
		System.out.println(moreLarge(x1, y1));
		System.out.println(moreLarge(x2, y2));
		System.out.println(moreLarge(x3, y3));
		System.out.println(moreLarge(x4, y4));
		
	}

	public static String moreLarge(int[] firstArray, int[] secondArray) {
		if (firstArray.length < 2) {
			return "Array1 is not valid";
		} else if (secondArray.length < 2) {
			return "Array2 is not valid";
		} else if (firstArray[0]==secondArray[0] || firstArray[firstArray.length-1] == secondArray[secondArray.length-1]) {
			return "true";
		} else {
			return "false";
		}
	}

}
