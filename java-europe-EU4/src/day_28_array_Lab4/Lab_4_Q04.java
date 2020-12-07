package day_28_array_Lab4;

public class Lab_4_Q04 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y = {5,11,2};
		int[] z = {7,0,0};
		int[] a = {3,-2,10,4};
		
		System.out.println(sumOfAll(x));
		System.out.println(sumOfAll(y));
		System.out.println(sumOfAll(z));
		System.out.println(sumOfAll(a));
		
	}
	public static int sumOfAll(int[] array) {
		int sum=0;
//		for(int i=0; i<array.length;i++) {
//			sum=array[i]+sum;
//		}
		for( int value:array) {
			sum+=value;
		}
		return sum;
	}
}
