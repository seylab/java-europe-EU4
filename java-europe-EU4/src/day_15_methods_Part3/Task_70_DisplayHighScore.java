package day_15_methods_Part3;

public class Task_70_DisplayHighScore {

	public static void main(String[] args) {
		
		int x = calculateHighScorePosition(500);
		displayHighScorePosition("Mehmet", x);
		displayHighScorePosition("cevdet", calculateHighScorePosition(1000));
		

	}

	public static void displayHighScorePosition(String name, int position) {
		
		System.out.println(name + " managed to get into position " + position + " on the high score table" );
	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000) {
			return 1;
		} else if (score >= 500 && score < 1000) {
			return 2;
		}else if(score>=100 && score<500) {
			return 3;
		}else {
			return 4;
		}
	}

}
