package coadingQuestions;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int n) {
		if(n==0){
			return 1;
		}
		else return n*fact(n-1);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("the Factorial of give number is:"+fact(n));
	}

}
