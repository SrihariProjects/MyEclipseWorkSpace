package com.Practice;

import java.util.Arrays;

class D{
	
	public static void largestNum(int[] nums) {
		int lnum=0;
		
		Arrays.sort(nums);
		int l=nums.length;
//		for(int i=0;i<=l;i++) {
			System.out.println(nums[l-1]);
//		}
//		for(int x:nums) {
//			
//			System.out.println(x);
//		}
		
		
		
	}
	
}
public class LargestNumber {

	public static void main(String[] args) {

		int[] nums= {1,4,2,5,8,4};
		D d=new D();
		d.largestNum(nums);
	}

}
