package day4Java;

//accessing parent properties to child is inheritance
//Ambiguity problem for Multiple inheritance so java doesn't support


public class Inheritance {

	public static void main(String[] args) {

		//		Calc c=new Calc(); //this is parent class
//		AdvCal ac=new AdvCal(); //By using child class we can use the methods of Parent class as well
		VeryAdvCal ac=new VeryAdvCal();
		int r1=ac.add(4, 8);
		int r2=ac.sub(7, 3);
		int r3=ac.mult(3, 7);
		int r4=ac.div(8, 4);
		double r5=ac.power(5,2);
		System.out.println(r1+" is sum and \n"+r2+" is sub \n"+r3+" is Multiplication \n"+r4+" is Division\n"+r5+" is power");
	}

}
