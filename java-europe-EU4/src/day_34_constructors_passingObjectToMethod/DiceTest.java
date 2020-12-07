package day_34_constructors_passingObjectToMethod;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice sixSide = new Dice(SIX_SIDES);
		Dice twentySide = new Dice(TWENTY_SIDES);
		
		rollDice(sixSide);
		rollDice(twentySide);
		
		
	}
	
	public static void rollDice(Dice d) {
		//rolling a 6 sided dice
		//the dice's value : 5
		
		System.out.println("Rolling a "+ d.getSides() + " sided dice"); //rolling a 6 sided dice
		
		//d.roll();
		
		System.out.println("The dice's value: " +d.getValue()); //The dice' value : 5
	}

}
