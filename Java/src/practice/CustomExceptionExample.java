package practice;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

public class CustomExceptionExample {

	public static void validVote(int age) {
		try {
			if (age < 18) {
				throw new InvalidAgeException("age must be more than 18");
			} else {
				System.out.println("Valid Age for vote");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void validText(String text) {
		try {
			String[] arr= {"A"};
			for(int i=0;i<arr.length;i++) {
			if(text!=arr[i]) {
				throw new InvalidTextException("Invalid text provided");
			}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
	}
		
	}

	public static void main(String[] args) {
		validVote(9);
		validText("ABC");

	}
}

class InvalidTextException extends Exception {
	public InvalidTextException(String error) {
		super(error);
	}
}