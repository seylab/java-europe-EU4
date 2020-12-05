package day_10_controlStatements_part4;

public class ternaryOperators {

	public static void main(String[] args) {
		
		String result;
		int score=88;
//		
//		if (score>60) {
//			result="fail";
//		}else {
//			result="fail";
//		}
//		
		result = score>60 ? "pass" : "fail";
		System.out.println(result);
		
		int x=5;
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);
		
	}

}
