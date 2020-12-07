package day_26_array_part3;

import java.util.Scanner;

public class MethodsArray2 {

	public static void main(String[] args) {

		
		System.out.println(findCar(4,"Honda")); //true
	}
	
	// createArray method will - accept one parameter which is carSize
	//user will enter some cars
	
	public static String[] createArray(int carSize) {
		
		Scanner sc = new Scanner(System.in);
		String[] carArray =new String[carSize];
		
		for (int i = 0; i < carArray.length; i++) {
			
			System.out.println("Enter your car #" + (i+1));
			carArray[i]=sc.next();
			
		}
		return carArray;
		
	}
	//findCar method - will accept 2 parameter which 1-int value, toFindCar
		//if car is found -return true
		//if not return false
	
	public static boolean findCar(int carNumber, String carBrand) {
		for(String car:createArray(carNumber)) {
			
			if(car.equalsIgnoreCase(carBrand)) {
				return true;
				
			}
			
		}
		return false;
		
	}
	
	
	

}
