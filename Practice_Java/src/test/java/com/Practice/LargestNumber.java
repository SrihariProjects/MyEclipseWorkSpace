package com.Practice;

import java.util.Arrays;

class D{
public static int LargestNum(int[] nums){
int lnum=0;

Arrays.sort(nums);
int l=nums.length;

//System.out.println(nums[l-1]);
return nums[l-1];
}
}
public class LargestNumber{
public static void main(String[] args){
D d=new D();
int[] arr={1,2,3,5,4,7,5,9};
System.out.println(d.LargestNum(arr));
}
}