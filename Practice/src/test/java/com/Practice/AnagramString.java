package com.Practice;

class J{
	public static void isAnagram(String str1,String str2) {
		
		int i;
		int length1=str1.length();
		int length2=str2.length();
		if(length1!=length2) {
			System.out.println("given String are not anagrams");
		}
		else{
			for(i=0;i<length1;i++) {
				for (int j=0;j<length2;j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						break;
					}
				}
			}
			System.out.println("Given Strings are anagrams");
			
		}
	}
}


public class AnagramString {

	public static void main(String[] args) {

		J j=new J();
		j.isAnagram("aabb", "abab");
	}

}
