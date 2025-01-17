package coadingQuestions;

import java.util.Arrays;

public class CheckArrayAreEqual {

	public static void main(String[] args) {

		int a[]= {1,2,3};
		int b[]= {1,2,3};
		
		//approch1
		System.out.println(Arrays.equals(a, b));
	
		boolean status=true;
		
		//approch 2
		if(a.length == b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
		}
		else {
			status=false;
		}
		if(status=true) {
			System.out.println("they are equal");
		}
		else {
			System.out.println("not equals");
		}
		
	}

}
