package day5Java;

import java.util.Objects;

class Laptop{
	 String model;
	 int price;
	 
	 //we are overriding the Object class method
	 public String toString() {
		 return model+ " : "+ price;
	 }

	@Override
	public int hashCode() {
		return Objects.hash(model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(model, other.model) && price == other.price;
	}
	 
//	 public boolean equals(Laptop that) {
//		 
//		 return this.model.equals(that.model) && this.price==that.price;
//		 
//	 }
}

public class ObjectClass {

	public static void main(String[] args) {

		Laptop obj=new Laptop();
		obj.model="Apple";
		obj.price=1234;
		
		Laptop obj2=new Laptop();
		obj2.model="Apple";
		obj2.price=1234;
		
		System.out.println(obj); //it prints memory address in hexavalues
		System.out.println(obj.toString()); //toString is a object class method
		
		boolean res= obj.equals(obj2); //this equals method also comes from object class
		System.out.println(res);
	}

}
