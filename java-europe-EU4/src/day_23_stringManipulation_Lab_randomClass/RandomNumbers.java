package day_23_stringManipulation_Lab_randomClass;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rn = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50));//0-49
		
		System.out.println(rn.nextInt(10)+5);//0-9
		//5-15
		
		
	}

}
