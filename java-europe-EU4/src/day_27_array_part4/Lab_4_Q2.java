package day_27_array_part4;

public class Lab_4_Q2 {

	public static void main(String[] args) {
		
		int[] x= {1,2,3};
		int[] y= {1,2,3,1};
		int[] z= {1,2,1};
		int[] k= {1};
		
		System.out.println(firstAndLast(x));
		System.out.println(firstAndLast(y));
		System.out.println(firstAndLast(z));
		System.out.println(firstAndLast(k));
		
	}
	public static String firstAndLast(int[] array) {
		if(array.length>1 && array[0]==array[array.length-1]) {
			return "true";
		}else if(array.length<=1) {
			return"not a valid array";
		}else {
			return "false";
		}
		
	}

}
