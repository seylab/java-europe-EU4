package day_45_exceptions;

public class Nullpointer {
    static String name;

    public static void main(String[] args) {

        try {
            System.out.println(name.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("NullPointerException happened");
            System.out.println("Here is the message: " + e.getMessage());
            System.out.println("Here is the stack trace: ");
            e.printStackTrace();


        }
    }
}
