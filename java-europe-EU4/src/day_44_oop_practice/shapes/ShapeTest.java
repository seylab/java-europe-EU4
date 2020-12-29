package day_44_oop_practice.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		//create 4 shapes, using polymorphism
	
		Shape square = new Square();
		Shape diamond = new Diamond();
		Shape triangle = new Triangle();
		Object shapeObject = new Shape();
		
		square.draw();
		triangle.draw();
		
		((Square)square).squareMethod();
		
		// Downcasting: cast reference type to object type
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	
		Shape obj = new Shape();
		obj.draw();
		
		obj = new Diamond();
		obj.draw();
		
		obj = new Square();
		obj.draw();
		
		obj = new Triangle();
		obj.draw();
		*/
		
		
		
		
		
		
		
	}
}
