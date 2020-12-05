package a_review.week12;

import java.text.DecimalFormat;

public class Circle {

    public final static double PI = 3.14;
    private   double radius, diameter,area,perimeter;

    public Circle( double radius){
        this.radius=radius;
        diameter = radius*2;
        area = CalculateArea();
        perimeter = CalculatePerimeter();
    }

    private double CalculateArea() {
        return radius*radius*PI;
    }


      private double CalculatePerimeter() {
        return diameter*PI;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat(("0.00"));
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }

    public static double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

   public double getDiameter() {
        return diameter;
    }


    public double getArea() {
        return area;
    }

//
    public double getPerimeter() {
        return perimeter;
    }

}
/*
circle:  
    attributes:
        r,PI,diameter,area,perimeter

    methods:
        calculatateArea(), CalculatePerimeter(),toString()

 */