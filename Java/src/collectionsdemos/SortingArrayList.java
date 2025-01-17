package collectionsdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Write a Java program to sort an ArrayList of strings by their lengths in ascending order.
public class SortingArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();

		al.add("Sriahri");
		al.add("Ghos");
		al.add("Testing");

		Collections.sort(al);

		// Collections.sort(al, Comparator.comparingInt(String::length));

		// Collections.sort(al, Comparator.comparingInt(String::length));

		System.out.println(al);

	}

}
