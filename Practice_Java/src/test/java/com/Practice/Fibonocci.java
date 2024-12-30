package com.Practice;

class C{
	
	public static void fibo(int n) {
		int a=0,b=1;
		System.out.print(a+","+b);
		
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.print(","+c);
			
			a=b;
			b=c;
		}
	}
	
	
}

public class Fibonocci {

	public static void main(String[] args) {

		C c=new C();
		c.fibo(1);
	}

}
