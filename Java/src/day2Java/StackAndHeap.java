package day2Java;


class CalculatorDemo{
	int n=5;   //instance variable
	
	public int add(int n1,int n2) {
		System.out.println(n);
		return n1+n2;
	}
}
public class StackAndHeap {

	public static void main(String[] args) {

		int data=10;
		
		CalculatorDemo cd=new CalculatorDemo(); //cd will be created at heap memory location
		CalculatorDemo cd1=new CalculatorDemo(); //new cd1 object will be created in heap memory location
		
		cd.n=6;
		System.out.println(cd.n);  //only cd object value will change not cd1 
		System.out.println(cd1.n);
	}

}
