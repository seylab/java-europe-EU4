package day24_array_part1;

public class task_90_FindHonda {

	public static void main(String[] args) {
		
		String[] cars= {"Honda", "Toyota", "Nissan", "BMW", "Mercedes", "Porsche", "Ferrari"};
		
		boolean flag = false;
		
		for (int i = 0; i < cars.length; i++) {
			
			if(cars[i].equals("Honda")) {
				flag=true;
				break;
			}
			}
		if(flag) {
			System.out.println("I found your car Honda in this array");
		}else {
			System.out.println("I could not find your car Honda in this array");
		
		}
		
	}

}
