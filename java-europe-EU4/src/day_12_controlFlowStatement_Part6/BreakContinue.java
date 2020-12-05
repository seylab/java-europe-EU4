package day_12_controlFlowStatement_Part6;

public class BreakContinue {

	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {
//			if(i==4) {
//				break;
//			}
//			System.out.println(i);
//		}
		for (int i = 4; i <= 5; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
