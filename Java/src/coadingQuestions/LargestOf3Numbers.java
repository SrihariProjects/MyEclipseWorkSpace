package coadingQuestions;

public class LargestOf3Numbers {

	public static void main(String[] args) {

		int a=0,b=13,c=-10;
		
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
		
		
		//The ternary operator (condition ? value_if_true : value_if_false) is a shorthand for an if-else statement.
		int largest = a>b?a:b;
		
		int largest_new=c>largest?c:largest;
		
		System.out.println(largest_new);
	}

}
