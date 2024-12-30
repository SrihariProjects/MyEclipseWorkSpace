package day7Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> nums=new HashSet<Integer>();
		nums.add(64);
		nums.add(72);
		nums.add(75);
		nums.add(12);
		nums.add(59);
		nums.add(30);
		
		
		Iterator<Integer> values=nums.iterator();
		
		while(values.hasNext()) {
		
		System.out.println(values.next());
		}
//		for(int n:nums) {
//			System.out.println(n);
//		}
	}

}
