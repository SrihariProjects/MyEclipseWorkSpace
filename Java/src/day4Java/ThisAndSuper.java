package day4Java;


//By default every Const is super()
//every class int jave extends Object class
class A{

	public A() {
//		super();
		System.out.println("in A method");
	}
	public A(int n) {
//		super()
		System.out.println("I am A Parameter Const");
	}

}

class B extends A{

	public B() {
//		super(5);
		System.out.println("in B method");
	}
	public B(int a) {
//		super(a); //then it will call prameter const of parent class
		this(); //this keyword will execute the constructor of same class
		System.out.println("I am B Parameter Const");
	}
}


public class ThisAndSuper {

	public static void main(String[] args) {

		//		B obj=new B(); //it will call the constructor of sub class and super class
//		B obj1=new B(5); //it will call parameter Const and parent Constu
//		B obj2=new B();
		
		//I want ot execute both Constuctor of B
		B obj3=new B(5); //this keyword will execute the constructor of same class

	}

}
