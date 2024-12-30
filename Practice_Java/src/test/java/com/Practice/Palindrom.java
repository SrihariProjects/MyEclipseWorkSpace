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
		
		
	}

}
