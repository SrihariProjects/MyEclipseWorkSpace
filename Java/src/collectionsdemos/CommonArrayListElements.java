package collectionsdemos;

import java.util.ArrayList;

public class CommonArrayListElements {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(2);
		
		ArrayList	al2=new ArrayList();
		al2.add(2);
		al2.add(1);
		
		al.retainAll(al2);
	}

}
