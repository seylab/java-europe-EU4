package day_05_unary_asignment_relation;

public class task19_DecrementIncrement {

	public static void main(String[] args) {
		
		int a = 50;
		int resulta    = --a + a++ + a-- + a++;
		//a in memory:50 - 49 - 50 - 49 - 50
		//result	 :     49 + 49 + 50 + 49=197
		System.out.println(resulta);

	}

}
