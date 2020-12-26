package a_review.week15;

public abstract class Shape {

    static  String name;
    double area;
    double perimeter;

    public abstract  double calculateArea();
    public abstract  double calculatePerimeter();

}
    /*


    1. create an abstract class called Shape
			attributes:
				name(static), area, perimeter, hasVolume(static), volume
			abstract methods: calculateArea(), calculatePerimeter(), calculateVolume()
						return-types: double


     */