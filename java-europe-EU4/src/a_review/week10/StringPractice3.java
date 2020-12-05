package a_review.week10;

import java.util.*;

public class StringPractice3 {

	public static void main(String[] args) {

		String str = "aaaaaaaaaaaaabbbbbbbbbbbbbbbbbcccccccccccccccccccccaaaaaaaaaaaa";

		String result = "";
		int counter=0;
		
		for (String each : str.split("")) {
			if (!result.contains(each)) {
				result += each;
				counter++;
			}
		}
		
		System.out.println(counter);
		System.out.println(result);
		System.out.println(Arrays.toString(result.split("")));
	}

}
/*
 * Remove duplicated characters "aabbcca" => "abc"
 */