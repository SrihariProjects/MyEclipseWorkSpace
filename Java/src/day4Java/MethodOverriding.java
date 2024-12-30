package day4Java;

class A1 {

	void show() {
		System.out.println("in A1 show");
	}
	public void config() {
		
		System.out.println("in A1 config");
	}
}

class B1 extends A1 {
	@Override
	//this will rewrite the show method of parent class
	void show() {
		System.out.println("in B1 Show");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		B1 obj = new B1();
		obj.show();
		obj.config();

	}

}
