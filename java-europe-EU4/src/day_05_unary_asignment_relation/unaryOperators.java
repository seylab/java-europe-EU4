package day_05_unary_asignment_relation;

public class unaryOperators {

	public static void main(String[] args) {
		
		int i1=+10;
		int i2= -100;
		int i3= -(i1+i2); //-(10-10)= - -90= 90
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		
		int i=10, j=5;
		i++;// same as i = i+1
		--j;//same as j=j-1
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		//i=11, j=4
		int res = i++ + --j;
		System.out.println("res = " + res );
	

	}

}
