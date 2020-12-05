package day24_array_part1;

public class ArrayCreation {
	public static void main(String[] args) {
		
		int[] scores = new int[5];
		scores[0]=80;
		scores[1]=85;
		scores[2]=90;
		scores[3]=100;
		scores[4]=50;
		// scores[5]=70;  -> out of the bound
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
				
		//option 1 (size of the array cannot be changed)
		int[] numbers;
		numbers= new int[3];
		
		//option 2
		int[] numbers1= new int[4];
		float[]temp  = new float[100];
		char[] letters = new char[40];
		long[] units = new long[50];
		String words[] = new String[5];
		
		System.out.println(numbers[2]);	// 	default value for int "0"
		System.out.println(temp[82]); 	//  default value for float "0.0"
		System.out.println(words[4]); 	//  default value for String is null
		System.out.println(units[49]);	//	default value for long is "0"
		System.out.println(letters[20]);//	default value for char is " "(nothing)
		
		
		
	}

}
