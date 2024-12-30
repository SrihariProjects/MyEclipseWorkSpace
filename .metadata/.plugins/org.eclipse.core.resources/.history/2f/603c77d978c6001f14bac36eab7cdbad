package com.collectionsdemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("x");
		al.add("y");
		al.add("e");
		al.add("t");
		al.add("b");
		al.add("c");
		
		ArrayList al_dup=new ArrayList();
		
		//add all method
		al_dup.addAll(al);
		
		System.out.println(al_dup);
		
		//remove all method
		al_dup.removeAll(al);
		
		System.out.println("After removing :"+al_dup);
		
		//By using Collection class we can do Sorting
		//Sort-----   Collections.sort()
		
//		Collections c=new ArrayList();
		Collections.sort(al);
		System.out.println("Elements in the array after sorting:"+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in the array after reverser Order:"+al);
		
		Collections.shuffle(al);
		System.out.println("Elements after Shuffle:"+al);
		
	}

}
