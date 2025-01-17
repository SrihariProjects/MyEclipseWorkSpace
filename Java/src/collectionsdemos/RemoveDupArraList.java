package collectionsdemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupArraList {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(2);
		al.add(3);
		al.add(2);
		
		
		HashSet<Integer>  set=new HashSet<>();
		
		set.addAll(al);
		
		System.out.println(set);
		
	}

}
