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
		
		R1 r1=new R1();
		
		r1.rev("fdsa");
	}

}

class R1{
	
	public static void rev(String str) {
		
		String strRev="";
		String str2=str.toLowerCase();
		int end=str2.length()-1;
		for(int i=end;i>=0;i--) {
			strRev=strRev+str2.charAt(i);
		}
		
		System.out.println(strRev);
	}
}
