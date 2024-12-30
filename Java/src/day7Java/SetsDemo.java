package day7Java;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		//if you need to accept only unique values
		//Set will not sort automatically
		//get() methods is not present for getting value using index
		Set<Integer> nums=new HashSet<Integer>();
		nums.add(64);
		nums.add(72);
		nums.add(75);
		nums.add(12);
		nums.add(59);
		nums.add(30);
		
		System.out.println(nums);
		
		for(int n:nums) {
			System.out.println(n);
			
		//Tree set sort values automatically	
		Set<Integer> nums1=new TreeSet<Integer>();
		nums1.add(64);
		nums1.add(72);
		nums1.add(75);
		nums1.add(12);
		nums1.add(59);
		nums1.add(30);
		
		for(int x:nums1) {
			
			System.out.println("Sorted values"+x);
		}
		}
	}

}
