package com.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class F{
	
	public static int secLarNum(int[] arr) {
		int ln=0;
		
		Arrays.sort(arr);
		int l=arr.length;
		
		return arr[l-2];
		
	}
	
}

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new F();
		int[] arr=new int[6];
		arr[0]=3;
		arr[1]=7;
		arr[2]=9;
		arr[3]=4;
		arr[4]=45;
		arr[5]=78;
		System.out.println(f.secLarNum(arr));
	}

}
