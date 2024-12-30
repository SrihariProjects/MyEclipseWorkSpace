package day7Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		Collection<Integer> nums=new ArrayList<Integer>();
		
		//if you want to print index values
//		List<Integer> list=new ArrayList<Integer>();
		
		//or we can use Arraylist directly
//		ArrayList nums=new ArrayList();
		nums.add(4);
		nums.add(6);
//		System.out.println(nums.get(0));
		
		for(Object n:nums) {
			
			int num=(Integer)n;
			
		System.out.println(num*2);
		
		}
	}

}
