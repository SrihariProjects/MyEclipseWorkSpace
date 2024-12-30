package day5Java;


abstract class Car{
	
	
	public abstract void drive();
	
//	abstract void fly();
	public void playMusic() {
		System.out.println("Plying music");
	}
}

//we can skip using abstract methods in child class but we need to make that class as abstract
abstract class Test extends Car{
	
}

//we need to implements all abstact methods of parent class in child class
class WagnoR extends Car{
	public void drive() {
		System.out.println("Driving");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		Car obj; //you can create reference
//		obj=new Car(); //but you can not create Object of abstract class
		obj=new WagnoR();
		obj.playMusic();
		obj.drive();
		
		
	}

}
