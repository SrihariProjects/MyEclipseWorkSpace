package coadingQuestions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		/*
		 * //approch1 int rev=0; while(num!=0) { rev=rev*10 + num%10; num=num /10; }
		 */
		
//		//approch2
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		System.out.println(sb.reverse());
		
		//approch3
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		System.out.println(sbl.reverse());
	}

}
