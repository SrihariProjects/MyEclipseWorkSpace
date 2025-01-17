package coadingQuestions;

public class Swapping2Numbers {

	public static void main(String[] args) {

		int a=10,b=20;
		
		//Logic one
		int temp=a;
		a=b;
		b=temp;
		
		
		//Logic2
		a=a+b;  //10+20=30
		b=a-b;	//30-20=10
		a=a-b;	//30-10=20
		
		//Logic 3 a and b values should not be 0
		a=a*b;  //10*20=200
		b=b/a;	//20/200=10
		a=a/b;  //200/10=20
		
		
		
		System.out.println("After Swapping"+a+" and "+b);
	}

}
