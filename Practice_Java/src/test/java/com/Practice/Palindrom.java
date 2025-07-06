package com.Practice;


class E{
	public static boolean isPoli(String str) {
		
		int start=0;
		int end=str.length()-1;
		
		while(end>start) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
}
public class Palindrom {

	public static void main(String[] args) {
		E e=new E();
		System.out.println(e.isPoli("madam"));
		
//		P p=new P();
		System.out.println(P.po("1111222111"));
	}

}

class P{
	public static boolean po(String str) {
		int end=str.length()-1;
		int start=0;
		
		while(end>start) {
			if(str.charAt(end)!=str.charAt(start)) {
				return false;
			}
			end--;
			start++;
		}
		return true;
	}
	
}
