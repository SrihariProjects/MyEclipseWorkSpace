package coadingQuestions;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "cabc";

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		if (ch1.length == ch2.length) {
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch2, ch2)) {
				System.out.println("Given Strings are anagrams");
			} else {
				System.out.println("Given Strings are not anagrams");
			}

		} else {
			System.out.println("Given Strings are not anagrams");
		}
	}
}
