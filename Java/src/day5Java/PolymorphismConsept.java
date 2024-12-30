package day5Java;


/*
Poly--many
morphism--behaviour

polymorphism means same object acts as diff behaviour

2types
Compile time Polimorphism(Overloading)
Runtime Polimorphism(Overriding)

*/

class A{
	public void show() {
		System.out.println("in A show");
	}
}

class B extends A{
	public void show() {
		System.out.println("in B show");
	}
}

class C extends B{
	public void show() {
		System.out.println("in B show");
	}
}

public class PolymorphismConsept {

	public static void main(String[] args) {
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show(); //object is acting as diff based on their calss methods
	}

}
