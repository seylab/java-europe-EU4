package day_07_controFlowStatements;

public class task27_GoodMorning {

	public static void main(String[] args) {
		int hour=15;
		
		if(hour>=4 && hour<12) {
			System.out.println("Good Morning");
		}
		if( hour>=12 && hour<15) {
			System.out.println("Good Afternoon");
		}
		if(hour>=15) {
			System.out.println("Good Evening");
		}

	}

}
