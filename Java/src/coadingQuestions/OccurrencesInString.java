package coadingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OccurrencesInString {

	public static void main(String[] args) {

		String str = "You is a good boy";

		int[] count = new int[256];
		str=str.toLowerCase();
//		Map<Character, Integer> chacount=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				count[ch]++;
			}
		}

		for (int i = 0; i < 256; i++) {
			if (count[i] > 0) {
				System.out.println((char) i + "----" + count[i]);
//				System.out.println(count[i]);
			}
		}

	}
}
		
		
		
		
		
		
		
		
		
		
//		String str1 = "I am ghost of uchiha";
//
//		int[] chars = new int[256];
//		str1.toLowerCase();
//
//		for (int i = 0; i < str1.length(); i++) {
//
//			char ch = str1.charAt(i);
//			if (ch != ' ') {
//				chars[ch]++;
//			}
//
//		}
//
//		for (int i = 0; i < 256; i++) {
//			if (chars[i] > 0) {
//				System.out.println((char) i + "------" + chars[i]);
//			}
//		}
//
//		String str2 = "I am at home";
//
//		int[] counts = new int[256];
//
//		str2.toLowerCase();
//
//		for (int i = 0; i < str2.length(); i++) {
//			char ch = str2.charAt(i);
//
//			if (ch != ' ') {
//				counts[ch]++;
//			}
//		}
//		for (int i = 0; i < 256; i++) {
//			if (counts[i] > 0) {
//				System.out.println((char) i + "  --  " + counts[i]);
//			}
//		}
//
//		String str3 = "Believe in your self";
//		str3.toLowerCase();
//		int[] charCount = new int[256];
//
//		for (int i = 0; i < str3.length(); i++) {
//			char ch = str3.charAt(i);
//			if (ch != ' ') {
//				charCount[ch]++;
//			}
//
//		}
//		for (int i = 0; i < 256; i++) {
//
//			if (charCount[i] > 0) {
//				System.out.println((char)i+"------------"+charCount[i]);
//			}
//
//		}
//
//		String string="Everything goes as planned";
//		
//		
//		int[] counting=new int[256];
//		string.toLowerCase();
//		
//		for(int i=0;i<string.length();i++) {
//			
//			char ch=string.charAt(i);
//			
//			if(ch!=' ') {
//				counting[ch]++;
//			}
//			
//		}
//		
//		for(int i=0;i<256;i++) {
//			if(counting[i]>0) {
//				System.out.println((char)i+"--------------------"+counting[i]);
//			}
//		}
//	}

//}
