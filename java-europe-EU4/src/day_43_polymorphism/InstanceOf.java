package day_43_polymorphism;

public class InstanceOf {

	public static void main(String[] args) {
		
		Shape sh = new Circle();
		
		if (sh instanceof Triangel) {
			System.out.println("Triangel");
		} else if ( sh instanceof Circle){
			System.out.println("Circle");
		} else {
			System.out.println("Square");
		}
		
	}
}
