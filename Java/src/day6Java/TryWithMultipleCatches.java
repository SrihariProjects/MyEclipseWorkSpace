package day6Java;

//we can create our own exceptions

public class TryWithMultipleCatches {

	public static void main(String[] args) {

		int num[]=new int[5];
		
		int i=0;
		int j=9;
		
		String str=null;
		
		try {
			j=i/j;
			if(j==0) {
				//throw keyword used to theow an exception
				throw new ArithmeticException();
			}
		}
//		try {
////			j=j/i;
//			System.out.println(str.length());
//			
//			System.out.println(num[6]);
//			System.out.println(num[2]);
//		}
		catch(ArithmeticException e){
			System.out.println("Something went Wrong"+e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (Exception e) { //Exception is a parent class
			System.out.println(e);
			
		}
	}

}
