package coadingQuestions;

public class FibonacciSeries {

	public static void fibonacci(int n) {
		
		//0,1,1,2,3,5,8,13...
		if (n <= 0) {
			System.out.println("please enter a number is greter than zero");
		} else if (n == 1) {
			System.out.println(0);
		} else {
			int a = 0, b = 1;
			System.out.print(a + " " + b + " ");
			for (int i = 2; i < n; i++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;

			}
		}
	}

	public static void main(String[] args) {
//		FibonacciSeries fs = new FibonacciSeries();
		fibonacci(0);
		fibonacci(1);
		fibonacci(5);
	}

}
