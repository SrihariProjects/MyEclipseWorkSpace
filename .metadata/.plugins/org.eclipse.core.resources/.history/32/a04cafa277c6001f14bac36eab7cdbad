package day3;

class Demo{
	
	//generating getter and setters using shortcut
	//right click
	//source
	//generate setters and getters
	int age;
	String name; //these are instance variables
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
//		age = age;  //these are local variables so it thinks age is same as age in local
		this.age=age; //this represents current object
	}
	public String getName() {
		return name;
	}
	
	//we can use obj reference method also So Java directly Provides This Option
	public void setName(String name,Demo d) {
		Demo d1=d; //here we are taking the address of the object and assigining
		d1.name=name; //so what ever value is present in d1 object address that will assign to name
	}
	
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.setAge(4);
		d.setName("hari",d);
		
		System.out.println(d.getAge());
		System.out.println(d.getName());

	}

}
