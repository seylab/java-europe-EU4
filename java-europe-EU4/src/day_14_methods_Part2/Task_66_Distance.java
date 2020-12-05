package day_14_methods_Part2;

public class Task_66_Distance {
/*The distance a vehicle travels can be calculated as follows:
	Distance = Speed * Time
	Write a method named distance that accepts a vehicle’s speed 
	and time as arguments,
	and return the distance the vehicle has traveled.
*/
	public static void main(String[] args) {
		
		distance(50,80);
		int vehicleHasTraveled = distance(50, 80);
		System.out.println(vehicleHasTraveled);
	}
	public static int distance(int speed, int time) {
		int resultDis= speed*time;
		return resultDis;
	}
}
