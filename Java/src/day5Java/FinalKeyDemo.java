package day5Java;


final class Calc{  // this can't be inherited
	final public void show() {  //no one can override this method
		System.out.println("in A show");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	} 
	
}

//class By extends Calc{
//	
//}
public class FinalKeyDemo {

	public static void main(String[] args) {

		int num=8;
		num=10;  //you can change num value
		
		final int num1 =7; //we can't update the value
		
		System.out.println(num);
		  
		System.out.println(num1);
		
		Calc obj=new Calc();
		obj.show();
		obj.add(4, 5);
	}

}
