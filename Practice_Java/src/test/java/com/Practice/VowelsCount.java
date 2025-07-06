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
//		H h=new H();
//		System.out.println(h.returnVowelCount("AeIoua"));
		
//		Y y=new Y();
//		System.out.println(y.removeowles("AEIOU"));
		
		R r=new R();
		r.reverse("Srihari");
	}

}

class Y{
	public static int removeowles(String str) {
		
		int count=0;
		int length=str.length();
		char[] arr= {'A','E','I','O','U','a','e','i','o','u'};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<length;j++) {
				if(arr[i]==str.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
}

class R{
	public static void reverse(String str)
	{
		String rev="";
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1.reverse());
	}
}