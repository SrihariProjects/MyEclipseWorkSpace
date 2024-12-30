package com.Practice;


class H{
	public static int returnVowelCount(String str) {
		int count=0;
		char[] arr= {'A','E','I','O','U','a','e','i','o','u'};
		int length=str.length();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<length;j++) {
			if(arr[i]==str.charAt(j))
			{
				count++;
			}
			
		}
		}
		
		return count;
	}
	
}
public class VowelsCount {

	public static void main(String[] args) {
		H h=new H();
		System.out.println(h.returnVowelCount("AeIoua"));
	}

}
