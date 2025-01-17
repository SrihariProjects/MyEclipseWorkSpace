package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;

//Write a Java program to merge two sorted ArrayLists into a single sorted ArrayList
public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		ArrayList al1=new ArrayList();
		al1.add(3);
		al1.add(4);
		al1.add(6);
		al1.add(7);
		
		ArrayList al2=new ArrayList();
		al1.add(33);
		al1.add(42);
		al1.add(68);
		al1.add(75);
		
		
		Collections.sort(al1);
		Collections.sort(al2);
		
		al1.addAll(al2);
		
		System.out.println(al1);
	}

}
