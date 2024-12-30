package com.collectionsdemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Decllare ArralyList
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		ArrayList<String> al=new ArrayList<String>();
//		List al=new ArrayList();
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Welcome");
		al.add(15.3);
		al.add('A');
		al.add(true);
		
		System.out.println(al);
		System.out.println("Number of Element in array:"+al.size());
		
		//remove
//		al.removeAll(al);
		al.remove(1);
		System.out.println("After removing an element from array:"+al);
		
		//insert a new element
		al.add(1,"srihari");
		System.out.println("After Inserstion:"+al);
		
		//retrieve specific elemetn
		System.out.println(al.get(2));
		
		//replace element
		al.set(0, 101);
		System.out.println("After replecing with new element"+al);
		
		//search-contains() - return true or false
		System.out.println(al.contains(101));
		System.out.println(al.contains("sriahri121"));
		
		//isEmpty
		System.out.println(al.isEmpty());
		
		// 1) for loop
		System.out.println("Reading elements using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		// 2) for.. each loop
		System.out.println("Reading element from for Each Loop");
		for(Object e:al) {
			System.out.println(e);
		}
		
		// 3) Iteratior
		System.out.println("reading elements using iterator method");
		 Iterator it=al.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 
		
	}

}
