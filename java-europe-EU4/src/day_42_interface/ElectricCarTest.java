package day_42_interface;

public class ElectricCarTest {
    public static void main(String[] args) {
        //ElectricCar ec = new ElectricCar(); ERROR- can not be instantiated

        Tesla modelS= new Tesla("ModelS",45000,"grey");
        modelS.charge();
        modelS.start();
        modelS.drive();
        modelS.stop();

        System.out.println("==========================");

        Ford fusion = new Ford("Fusion", 35000, "Black", 2017);
        fusion.charge();
        fusion.start();
        fusion.drive();
        fusion.stop();

        System.out.println("==========================");

        TeslaSemi semi = new TeslaSemi("Semi", 50000, "Brown", 3.5);
        semi.charge();
        semi.start();
        semi.load("Orange");
        semi.drive();
        semi.drive();

        System.out.println("==========================");

        TeslaTruck tr = new TeslaTruck("CybertekTruck", 100000, "White", 6.0);
        tr.charge();
        tr.start();
        tr.load("Java book");
        tr.drive();
        tr.stop();

        System.out.println("==========================");

        System.out.println(modelS.toString());
        System.out.println(fusion.toString());
        System.out.println(tr.toString());


    }
}
