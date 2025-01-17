package day7Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {

		//HashSet-->HashMap
		HashSet<Integer> data=new HashSet<Integer>();
		data.add(7);
		data.add(6);
		data.add(9);
		data.add(19);
		data.add(2);
		data.add(2);
		data.add(null);
		
		
		System.out.println(data);
		System.out.println(data.size());
		
		System.out.println(data.contains(7));
		
		
		TreeSet<Integer> ts=new TreeSet<Integer>();
//		ts.addAll(data);
		
		System.out.println(ts);
		
		for(Integer n:data) {
			System.out.println(n);
		}
		
		
		//to remove we use Iterator Interface
//		Iterator<Integer> it=data.iterator();
//		while(it.hasNext()) {
//			Integer element=it.next();
//			System.out.println(element);
//			
//			if(element.equals(19)) {
//				it.remove();
//			}
//		}
		
		data.isEmpty();
		System.out.println(data);
		
		LinkedHashSet<Integer> data1=new LinkedHashSet<Integer>();
//		data1.addAll(data);
		
		System.out.println(data1);
		data1.add(8);
		data1.add(16);
		data1.add(7);
		data1.add(6);
		data1.add(9);
		data1.add(19);
		data1.add(2);
		data1.add(2);
		data1.add(null);
		
		System.out.println(data1);
		
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.addAll(data1);
//		ts1.add(null);
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.subSet(4, 7));
		System.out.println(ts.subSet(4, 7).remove(6));
		System.out.println(ts.subSet(4, 7));
		ts.descendingSet();
		System.out.println(ts.descendingSet());
		System.out.println(ts);
	}
	


}
