package a_review.week13;
/*
12/12/2020
        Review Topic: OOP Inheritance
        OOP Inheritance: building super & sub relationships. extends keyword

        super class: does not inherit any from sub class
sub class: can inherite from super class
class   B
class   A  extends  B   IS A
class   C  extedns  B   IS A
        Shape:
        variables:
        name, area, perimeter
        methods:
        calculateArea() , calculatePerimeter(), toString
        Rectangle extends Shape:  IS A

        Square extends Shape: IS A

        Circle extends Shape: IS A

        Triangle extedns Shape: IS A
        calculateArea(): base * height
method overriding: same method with different implementation
                    MUST happen in sub class
                    access modifier MUST be same or more visible
                            visibility: public > protected > default
                    returnType, methodName, parameter MUST be same
IS A  vs HAS A:
class Engine{

}
class Car{
    Engine engine = new Engine();  // Car HAS An Engine
}
class Toyota extends Car {   // Toyota IS A Car

    Engine engine = new Engine();  // Toyota HAS An Engine
}
*/
/*
Tasks:
    cerate package: ShapeTask
    Shape: area, perimeter
    square, rectangle, circle, triangle, cylinder, Cube...


 */
