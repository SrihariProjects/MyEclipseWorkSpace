package day1Java;

public class Operators {

	public static void main(String[] args) {

		int n1=4;
		int n2=9;

		int result=n1+n2;
		
		int divide=n1%n2;
		
		n1=n2;
		
		System.out.println(n1); //now n1 holds n2 value
//		System.out.println(divide);
		
		n1+=2; //this will add with 2 to n1 (n1=n1+2)
		System.out.println(n1);
		
		n1++;  //this is POST increment 
		System.out.println(n1);
		
		n1--;
		System.out.println(n1);
		
		++n1;  //this is pre increment
		System.out.println(n1);
		
		int num=5;
		int res=++num; //fiesrt it will increse by 1 the it fetch num value
		System.out.println(res);
		
		
	}
}
