package day_38_inheritance_part2.CarTest;

public class Car extends Vehicle{

	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Maximum speed:" + super.maxSpeed);
		System.out.println("Maximum speed:" + maxSpeed);
	}
}
