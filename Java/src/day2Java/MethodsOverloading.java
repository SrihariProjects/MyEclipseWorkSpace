package day2Java;



class Calculator {
	
	
	//same name method but diff parameters
	public int add(int n1, int n2,int n3) {
		return n1+n2+n3;
	}
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public double add(double n1,int n2) {
		return n1+n2;
	}
	
	
}


public class MethodsOverloading {
	
	
	public static void main(String[] args) {

		Calculator c=new Calculator();
		c.add(9, 8, 8);
		c.add(3, 4);
		c.add(6.7, 9);
	}

}
