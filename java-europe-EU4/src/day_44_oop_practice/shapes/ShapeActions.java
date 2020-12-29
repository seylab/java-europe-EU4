package day_44_oop_practice.shapes;

import static day_44_oop_practice.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ShapeActions {

	public static void main(String[] args) {

		Square mySquare = new Square();
		
		ShapeManager.drawSquare(mySquare);
		drawSquare(mySquare);
		
		String type = "square";
		buildShape(type);
		
		drawSquare((Square)buildShape(type)); //casting
		
		Object rand = new Random();
		System.out.println(((Random)rand).nextInt(5)); //casting
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Triangle());
		
		drawShape(myList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
