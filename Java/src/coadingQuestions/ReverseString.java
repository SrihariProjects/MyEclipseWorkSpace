package coadingQuestions;

import java.util.Scanner;

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
		System.out.println("reversing the given string :"+stringReverse(s));

	}

}