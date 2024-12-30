package day1Java;

public class LogicalOperators {

	public static void main(String[] args) {

		int x=5;
		int y=5;
		int a=7;
		int b=9;
		
		boolean res=x>y && a>b;
		System.out.println(res);
		
		boolean res1=x>y || a>b;
		System.out.println(res);
		
		boolean res2=x>y != a<b;
		System.out.println(res2);
		
		System.out.println(!res2);
		
	}

}
