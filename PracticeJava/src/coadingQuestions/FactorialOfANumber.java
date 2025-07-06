package coadingQuestions;


class Fact{
	
	public static int fact(int n) {
		
		if(n==0 || n==1)
			return 1;
		
		else
			
		return n*fact(n-1);
	}
	
}


public class FactorialOfANumber {

	public static void main(String[] args) {

		System.out.println(Fact.fact(5));
	}

}
