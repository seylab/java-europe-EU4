package day40_accessmodifiers_final;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model = "M3";
		c.year = 2019;
		//c.door = 4;
		c.engine = 5.3;
		
		System.out.println(c.toString());		
	}
}
