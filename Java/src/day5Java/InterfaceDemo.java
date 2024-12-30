package day5Java;

//public abstract is by default will come for interface methods
//we can't create objct for inteface
//to use them in child class we will use implements
//every variable in interface final static
//if it is final we can't change values
//a class can implements multiple intefaces
interface  I{
	public abstract void show();
	void config();
	int age=24;
	final static String area="AndhraPradesh";
}

interface  K{
	public abstract void show();
	public abstract void configdemo();
	void config();
	int age=24;
	final static String area="AndhraPradesh";
}

class J implements I,K{

	@Override
	public void show() {
		System.out.println("in show");
	}

	@Override
	public void config() {
	System.out.println("In config");	
	}

	@Override
	public void configdemo() {
		System.out.println("In configdemo");	
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {

		I obj;
//		obj=new I();
		obj = new J();
		obj.show();
		obj.config();
		
	}

}
