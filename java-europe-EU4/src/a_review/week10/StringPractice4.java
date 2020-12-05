package a_review.week10;

import java.util.*;

public class StringPractice4 {

	public static void main(String[] args) {

		String sentence = "I love java,Java is cool, jAvA is Fun javajavajavajavajavajavajavajavajavajavajava javajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajavajava";
		String originalSentence = sentence;
		sentence = sentence.toLowerCase();

		String word = "JAVA";
		word = word.toLowerCase();
		int count = 0;

		while (sentence.contains(word)) {
			sentence = sentence.replaceFirst(word, "");
			count++;
		}
		System.out.println(count);

	}

}
/*
 * frequency of word, sentence= "I love java,Java is cool, jAvA is Fun" word
 * "java"
 */
