package day6Java;


//Compile time error
//Runtime error (Exceprion are belong to this type of errors)
//Logical error

public class Exceptions {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		try
		{
			j=18/i;
		}
		//It catches exception and perform next execution
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(j);
		
		System.out.println("Bye"); //if previous condition fail this will not execute
	}

}
