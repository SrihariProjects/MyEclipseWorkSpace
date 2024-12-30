package com.Practice;

class B{
	
	public static boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			return false;
		}
		}
		return true;
	}
}



public class CheckPrimeNum {

	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.isPrime(2));
	}

}
