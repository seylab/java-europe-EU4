package day_05_unary_asignment_relation;

public class task20_DecrementIncrement {

	public static void main(String[] args) {
		int a= 1;
		a= -a-- + a++ / -a-- * --a;

		//m 1 , 0 ,  1,   0, -1
		//r    -1 +  0 / -1* -1

		System.out.println(a); //-1

	}

}
