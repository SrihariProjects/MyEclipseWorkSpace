package day6Java;

public class FinalFinallyFinalizeDemo {

	// 1. Final Variable (Constant)
	private static final double PI = 3.14159;

	// 2. Final Method
	public final void displayMessage() {
		System.out.println("This is a final method. It cannot be overridden.");
	}

	public static void main(String[] args) {
		// 1. Final Keyword
		final int number = 100;
		// number = 200; // Uncommenting this will cause a compilation error because `number` is final.

		System.out.println("Final Variable: PI = " + PI);
		System.out.println("Final Local Variable: number = " + number);

		// 2. Finally Block
		try {
			System.out.println("Inside try block.");
			int result = 10 / 0; // This will cause an ArithmeticException
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("This is the finally block. It always executes.");
		}

		// 3. Finalize Method (Deprecated but still usable)
		FinalizeDemo finalizeDemo = new FinalizeDemo();
		finalizeDemo = null; // Eligible for garbage collection
		System.gc(); // Suggests JVM to run garbage collector (not guaranteed)

		System.out.println("Main method ends.");
	}
}

// 1. Final Class
final class FinalClass {
	// No class can extend this class
	public void show() {
		System.out.println("This is a final class. It cannot be extended.");
	}
}

// 3. Finalize Method Example
class FinalizeDemo {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called. Cleaning up resources.");
	}
}
