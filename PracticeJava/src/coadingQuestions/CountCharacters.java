package coadingQuestions;

import java.util.HashMap;
import java.util.Map;

class CountChars {

	public static void charCount(String str) {

		char ch[] = str.toLowerCase().toCharArray();
		boolean[] visited = new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (visited[i] || ch[i] == ' ') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == (ch[j])) {
					count++;
					visited[j] = true;
				}
			}
			visited[i] = true;
			System.out.println("the character " + ch[i] + " is repeted " + count + " times");
		}
	}

}

public class CountCharacters {

	public static void main(String[] args) {
		CountChars.charCount("I ama I Am");

		String str = "I a a m a a I";

		int res = str.length() - str.replaceAll("a", "").length();

		System.out.println(res);

		str = str.toLowerCase();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == ' ') {
				continue;
			}
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		for (char key : map.keySet()) {
			System.out.println("Character " + key + " occured " + map.get(key));
		}

	}

}
