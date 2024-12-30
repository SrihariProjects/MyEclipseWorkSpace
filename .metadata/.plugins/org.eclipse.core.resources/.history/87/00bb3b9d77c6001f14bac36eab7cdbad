package day3;

//when you want to assign values while creating Objects
//for that we use Construstor


class Animal{
	
	private int age;
	private String name;
	
	//Constructor should have same name as Class name
	//It does not return anything
	
	//this is default Constructor
	public Animal() {
		 age=12;
		 name="Pig";
		System.out.println("In Constructor");
	}
	
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		this.age=age;
		return age;
	}
	
	
	//Parameterized Constructor
	public Animal(int age,String name) {
		System.out.println(age);
		System.out.println(name);
	}
	
}

public class ConstructorsDemo {

	public static void main(String[] args) {

		
		Animal obj=new Animal(); //this will call the constructor
		Animal obj1=new Animal(24,"Srihari"); //this will call the parameterized Constructor
		
		
		//we are assigning values at Constructor level and getting it
		System.out.println(obj.getAge());
	}

}
