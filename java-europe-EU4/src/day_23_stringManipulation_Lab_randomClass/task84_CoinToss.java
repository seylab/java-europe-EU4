package day_23_stringManipulation_Lab_randomClass;

import java.util.*;

public class task84_CoinToss {

	public static void main(String[] args) {

		Random rn = new Random();
		
		for(int i=0;i<10;i++) {
			
			if(rn.nextInt(2)==0) {
				System.out.println("Tails");    //Tail=0 Heads=1
			}else {
				System.out.println("Heads");
			}
			
			
			
		}

	}

}
