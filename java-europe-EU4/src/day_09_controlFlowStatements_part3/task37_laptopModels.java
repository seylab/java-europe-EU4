package day_09_controlFlowStatements_part3;

public class task37_laptopModels {

	public static void main(String[] args) {
		// Write a program that lets user to enter apple,dell,acer laptop models
		//If it is apple show “Apple-no virus”
		//If it is dell show “Tough one”
		//If it is acer show “Not recommended”
		//Else “do not buy that one!”
		
		String computer="hp";
		
		switch (computer) {
		
		case "apple":
			System.out.println("Apple-no virus");
			break;
		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Not recommended");
			break;
		default: 
			System.out.println("do not buy that one!");
		}
		
		
		
	}

}
