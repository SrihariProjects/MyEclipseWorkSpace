package com.Practice;

class A{
	public static String strReverse(String str) {
		String revString="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			String str1=str.toLowerCase();
			revString=revString+str1.charAt(i);
		}
		
		
		return revString;
	}
}

public class ReverseString {

	public static void main(String[] args) {
		
		A a=new A();
		
		
		System.out.println(a.strReverse("Srihari"));
	}

}
