package coadingQuestions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String str = "llaptop";
		int count = 0;
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] == ch[j]) {
					System.out.println("duplicate characters are --->" + ch[i]);
				}

			}

		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Integer cou = 1;

		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], cou);
			} else {
				map.put(ch[i], map.get(ch[i])+1); 

			}
		}
		for(Character key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key+":"+map.get(key));
			}
		}
	}

}
