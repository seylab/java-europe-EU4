package day40_accessmodifiers_final;

public class FinalMethods {
	public void method1(){
		System.out.println("Method-1");
	}
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
	}
}
class Sub extends FinalMethods{
	/*
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	/*
	public static void staticMethod(String w) {
		System.out.println("Static method in sub class");
	}
	*/
}
