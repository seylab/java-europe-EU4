package day_42_interface;

public interface Electric {

    public static final boolean HAS_BATTARIES = true;
    boolean HAS_BATTERIES2 = false; //public final static
    public abstract void charge();

    void  charge2();

    public default void MethodA(){
        //code
    }
    public static void MethodB(){
        //code
    }
}
