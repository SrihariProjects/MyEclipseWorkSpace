package coadingQuestions;

public class FibonacciSeries {

	public void fibonacci(int n) {
		if (n <= 0) {
			System.out.println("please enter a number is greter than zero");
		} else if (n == 1) {
			System.out.println(0);
		} else {
			int a = 0, b = 1;
			System.out.println(a + " " + b + " ");
			for (int i = 2; i < n; i++) {
				int c = a + b;
				System.out.println(c + " ");
				a = b;
				b = c;

			}
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fs = new FibonacciSeries();
		fs.fibonacci(5);
	}

}
