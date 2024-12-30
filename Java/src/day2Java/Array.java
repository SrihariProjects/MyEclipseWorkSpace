package day2Java;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		//you can store multiple variables in an array
		int num[]= {1,2,3,4};
		
		//array starts with '0' index
		System.out.println(num[3]);
		
		//in for loop
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		//creating an array with size 4
		int num2[]=new int[4];  
		
		//adding number values
		
		num2[0]	=10;
		num2[4]=7;
		
		System.out.println(num[4]); //ArrayIndexOutOf Bounds Exception we will get
	}

}
