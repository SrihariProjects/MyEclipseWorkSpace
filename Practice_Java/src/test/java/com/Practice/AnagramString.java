package com.Practice;

import java.util.Arrays;

class J{
	public static void isAnagram(String str1,String str2) {
		
		int i;
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2) {
			System.out.println("given String are not anagrams");
		}
		
//		Arrays.sort(str1);
//		Arrays.sort(str2);
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("Given Strings are anagrams");
		}
		else {
			System.out.println("given Strings are not Anagrams");
		}
		
//		else{
//			for(i=0;i<length1;i++) {
//				for (int j=0;j<length2;j++) {
//					if(str1.charAt(i)==str2.charAt(j)) {
//						break;
//					}
//				}
//			}
//			System.out.println("Given Strings are anagrams");
//			
//		}
	}
}


public class AnagramString {

	public static void main(String[] args) {

		J j=new J();
		j.isAnagram("aabb", "abab");
	}

}
