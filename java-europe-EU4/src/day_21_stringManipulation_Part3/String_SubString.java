package day_21_stringManipulation_Part3;

public class String_SubString {

	public static void main(String[] args) {
		
		String sentence = "Java String manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		System.out.print(chars.substring(0, 2));
		System.out.print(word);
		System.out.println(chars.substring(2));
		
		String result = chars.substring(0, 2)+word+ chars.substring(2);
		System.out.println(result);

	}

}
