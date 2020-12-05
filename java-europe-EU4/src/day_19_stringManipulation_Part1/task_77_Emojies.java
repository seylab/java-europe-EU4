package day_19_stringManipulation_Part1;

public class task_77_Emojies {

	public static void main(String[] args) {

		String emoji = ":]";
		if (emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return; // stop execution
		}
		if (emoji.charAt(0) == ':') {
			if (emoji.charAt(1) == ')') {
				System.out.println(":) Smile");

			} else if (emoji.charAt(1) == '(') {
				System.out.println(":( Sad");
			} else if (emoji.charAt(1) == '/') {
				System.out.println(":/ Upset");
			} else if (emoji.charAt(1) == 'p') {
				System.out.println(":p Playful");
			} else {
				System.out.println("Invalid emoji");
			}

		} else if (emoji.charAt(0) == ';') {
			if (emoji.charAt(1) == ')') {
				System.out.println(";) Wink");
			} else if (emoji.charAt(1) == '0') {
				System.out.println(";0 Surprised");
			} else {
				System.out.println("Invalid emoji");
			}

		} else {
			System.out.println("Invalid emoji");
		}

	}

}
