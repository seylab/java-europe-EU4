package day_25_array_part2;

import java.util.Arrays;

public class task_92_TableArray {
	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=(i+1)*19;
			System.out.println(numbers[i]);
			
		
		}
		
		System.out.println(Arrays.toString(numbers));
	}

}
