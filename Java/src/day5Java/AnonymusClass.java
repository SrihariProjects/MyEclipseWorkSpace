package day5Java;


abstract class F{
	public abstract void show();
}


public class AnonymusClass {

	public static void main(String[] args) {

		
		//Anonymous class
//		F obj=new F();
		
		//using Anonymous class we can use abstract classes as well
		F obj=new F(){
			public void show() {
				System.out.println("I am in New Class");
			}
		};		
		obj.show();
		
		
	}

}
