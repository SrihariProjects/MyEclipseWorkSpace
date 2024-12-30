package day5Java;

class A3{
	
	public void show1() {
		System.out.println("In A show");
	}
}

class B3 extends A3{
	public void show2() {
		System.out.println("In B Show");
	}
}


public class TypeCasting {

	public static void main(String[] args) {
		
//		type cast into double
//		double d=4.5;
//		int n=(int)d;
//		System.out.println(n);
		
		//upcasting
		A3 obj= new B3();
		obj.show1();
		
		//downcasting
		B3 obj1=(B3)obj;
		obj1.show2();
		
		
		
		
	}

}
