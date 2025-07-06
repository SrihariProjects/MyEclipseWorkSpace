package coadingQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "Srihari";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		char[] nondup = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			boolean[] visited = new boolean[ch[i]];
			if (!visited[i]) {
				for (int j = i + 1; j < ch.length; j++) {
					if (ch[i] == ch[j]) {
//					System.out.println(ch[i]);
						visited[i] = true;
					} else {
						nondup[i] = ch[i];
					}
				}

				System.out.println("First non repeated character is -->" + nondup[0]);
				break;
			}

		}

		// second method
		String s = "BesthaSrihari";
		s = s.toLowerCase();

		char[] arr = s.toCharArray();

		for (int i = 0; i < arr.length; i++) {

			boolean isvisited = false;
			for (int j = 0; j < arr.length; j++) {

				if (i != j && arr[i] == arr[j]) {
					isvisited = true;
					break;
				}
			}
			if (!isvisited) {
				System.out.println(arr[i]);
				break;
			} else {
				System.out.println("there is no non repeated characters in a given string");
				break;
			}
		}

		// using Maps concept
		String ms = "GhostOfTheUchiha";

		ms = ms.toLowerCase();

		int count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < ms.length(); i++) {
			if (map.containsKey(ms.charAt(i))) {
				map.put(ms.charAt(i), map.get(ms.charAt(i)) + 1);
			} else {
				map.put(ms.charAt(i), count);
			}

		}

		for (char key : map.keySet()) {
			if (map.get(key) == 1) {
				System.out.println("The first non repeated char in given string is-->" + key);
				break;
			} else {
				System.out.println("no non repeted charactes in a given string");
				break;
			}
		}
	}

}
