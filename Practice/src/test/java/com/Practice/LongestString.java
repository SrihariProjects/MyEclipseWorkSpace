package com.Practice;

class I{
	
	public static void maxString(String str) {
		
		String longestString="";
		String[] sentense=str.split(" ");
		
		for(String s:sentense) {
			if(longestString.length()<s.length()) {
				longestString=s;
			}
		}
		System.out.println("Longest String is:"+longestString);
		
	}
	
}


public class LongestString {

	public static void main(String[] args) {

		String sentence="The quick brown fox jumps over the lazy dog";
		
		I i=new I();
		i.maxString(sentence);
	}

}
