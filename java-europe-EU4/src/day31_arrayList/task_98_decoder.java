package day31_arrayList;

public class task_98_decoder {

	public static void main(String[] args) {
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";

		System.out.println(decodeTheCode(str1));
		System.out.println(decodeTheCode(str2));

	}

	public static String decodeTheCode(String s1) {
		String dummy1 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isAlphabetic(s1.charAt(i)) || s1.charAt(i) == (' ')) {
				dummy1 += s1.charAt(i);
			}
		}
		String[] arr = dummy1.split(" ");

		String dummy2 = "";
		for (String value : arr) {
			dummy2 += decodeNumber(value) + " ";
		}
		return dummy2;
	}

	public static String decodeNumber(String s2) {

		switch (s2.toUpperCase()) {

		case "ZERO":
			return "0";
		case "ONE":
			return "1";
		case "TWO":
			return "2";
		case "THREE":
			return "3";
		case "FOUR":
			return "4";
		case "FIVE":
			return "5";
		case "SIX":
			return "6";
		case "SEVEN":
			return "7";
		case "EIGHT":
			return "8";
		case "NINE":
			return "9";
		default:
			return "";

		}
	}
}