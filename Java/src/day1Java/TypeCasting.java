package day1Java;

public class TypeCasting {

	public static void main(String[] args) {

		byte b=127;

		int a=12;

		int a1=(byte)b;
		
		byte b2=(byte)a;

		System.out.println(b2);
		System.out.println(a=b);
		//		System.out.println(b=a);//can't convert higher byte into lower nyte data type

		float f=9.89f;
		int x=(int)f;  //converts float value into int

		System.out.println(x);
		
		float fo=5.7f;
		int t=(int) f;
		
		

	}

}
