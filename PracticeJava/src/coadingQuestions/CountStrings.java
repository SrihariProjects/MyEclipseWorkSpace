package coadingQuestions;

import java.util.HashMap;
import java.util.Map;

class CountWords {
	public static void stringcount(String str) {
		String[] words = str.split(" ");
		int count = 0;
		boolean[] isVisited = new boolean[words.length];
		
		for (int i = 0; i < words.length - 1; i++) {
			if(!isVisited[i]) {
				count = 1;
				for (int j = i + 1; j < words.length; j++) {
					if (words[i].equalsIgnoreCase(words[j])) {
						count++;
						isVisited[j] = true;
					}
				}
				isVisited[i]=true;
				System.out.println("Repeted words are   " + words[i] + "--->" + count);

			}
		}
	}

}


public class CountStrings {

	public static void main(String[] args) {
 		
		
		CountWords.stringcount("I am a here of my I i life");
		
		
		String str="I I I I";
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		int count=1;
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}
			else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		for(String x:map.keySet()) {
			System.out.println("the count of word :"+x+" = "+map.get(x));
		}
	}

}

//using hashmap


