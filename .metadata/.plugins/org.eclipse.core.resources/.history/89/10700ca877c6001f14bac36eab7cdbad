package day3;


class Mobile{
	String brand;
	int price;
	
	static String name; //we are making this variable to common to all
	
	public void show() {
		System.out.println(brand+" "+price+" "+name);
	}
	
}
public class StaticKeywordDemo {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=10000;
		obj1.name="phone";
		
		Mobile.name="phoneStatic";
		
		Mobile obj2=new Mobile();
		obj2.brand="Nokia";
		obj2.price=23000;
		obj2.name="phone";
		
		obj1.show();
		obj2.show();
		
	}

}
