package day5Java;

class P{
	int age;
	public void show() {
		System.out.println("in P show");
	}
	
	class Q{
		public void config() {
			
			System.out.println("in config");
		}
		
	}
	static class R{
		public void run() {
			
			System.out.println("in run");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
		P obj=new P();
		obj.show();
		
		//syntax to create object for inner class
		P.Q obj2=obj.new Q();
		obj2.config();
		
		//for static inner classes
		P.R obj3=new P.R();
		obj3.run();
		
	}

}
