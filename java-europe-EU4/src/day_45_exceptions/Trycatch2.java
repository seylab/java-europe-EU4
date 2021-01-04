package day_45_exceptions;

public class Trycatch2 {

    public static void main(String[] args) {

        int[] nums = {36,6,34,12};

        //System.out.println(nums[0]);

        try {
            System.out.println(nums[6]);
        }catch (Exception e){
            //System.out.println("Wrong index");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }


        try {
            int j=100;
            int n=j/0;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
