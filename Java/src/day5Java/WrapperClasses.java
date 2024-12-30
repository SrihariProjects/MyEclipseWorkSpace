package day5Java;


//for every primitive type we have a class they are wrapper classes
//int--Integer

public class WrapperClasses {

	public static void main(String[] args) {

		int n=9;
		
		Integer n1=new Integer(9);  //boxing 
		
		Integer n2=10;  //autoboxing
		
		int n3= n2.intValue(); //auto-Unboxing
		
		System.out.println(n1);
		String str="12";
		
		int n4=Integer.parseInt(str);
		System.out.println(n4);
		
		
	}

}
