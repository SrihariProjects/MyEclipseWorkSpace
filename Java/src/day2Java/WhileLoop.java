package day2Java;

public class WhileLoop {

	public static void main(String[] args) {
		
		int i=1;

		while(i<5) {
			System.out.println("I am true");
			int j=3;
			while(j<7) {
				System.out.println("J is equal to 7");
				j++;
			}
			i++;
		}
	}

}
