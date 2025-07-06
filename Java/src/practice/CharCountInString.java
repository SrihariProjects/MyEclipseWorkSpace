package practice;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class CharCountInString {

	public static void main(String[] args) {

		String name="aabbcc";
		
		name=name.toLowerCase();
		
		HashMap<Character, Integer> charCount=new HashMap();
		for(char c:name.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
			
		}
		
		for(char c:charCount.keySet()) {
			System.out.println(c+" - - "+charCount.get(c));
		}
		
	}
}

class Cc{
	public static void main(String[] args) {
		String name="srihari";
		
		name=name.toLowerCase();	
		HashMap<Character, Integer> chatcou=new HashMap();
		for(char c:name.toCharArray()) {
			chatcou.put(c, chatcou.getOrDefault(chatcou, 0)+1);
			
		}
		for(char c:chatcou.keySet()){
			System.out.println(c+"    "+chatcou.get(c));
			
		}
	}
}
