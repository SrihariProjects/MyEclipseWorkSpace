package coadingQuestions;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a=5,b=3,c=70;
		
		//approch1
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
		
		//Approch2
		
		int largest = a>b?a:b;
		
		int largest_new=c>largest?c:largest;
		
		System.out.println(largest_new);
	}

}
