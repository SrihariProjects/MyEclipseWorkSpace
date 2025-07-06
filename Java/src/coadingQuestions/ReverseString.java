package coadingQuestions;

import java.util.Scanner;


//Logic 4
public class ReverseString {
	
	public static String stringReverse(String str) {
		String strReverse = "";
		for(int i=str.length()-1;i>=0;i--) {
			strReverse=strReverse+str.charAt(i);
		}
		
		return strReverse;
	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		System.out.println("reversing the given string :"+stringReverse(s));
		
		
//		//Logicone
//		StringBuilder sb=new StringBuilder(String.valueOf(s));
//		sb.append(s);
//		System.out.println(sb.reverse());
		
		
		//Logic2
//		StringBuffer sb=new StringBuffer();
//		sb.append(s);
//		System.out.println(sb.reverse());
		
		
		//Logic 3
		String rev="";
		char a[]=s.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println(rev);
		
	}
}
