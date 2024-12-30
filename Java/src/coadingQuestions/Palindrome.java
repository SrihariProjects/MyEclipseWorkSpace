package coadingQuestions;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPolindrom(String s) {
		s=s.toLowerCase();
		int start=0;
		int end=s.length()-1;
		while(end>start) {
			if(s.charAt(end)!=s.charAt(start)){
			return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("the give String "+str+" is a "+isPolindrom(str)+" for polindrome");
	}
}
