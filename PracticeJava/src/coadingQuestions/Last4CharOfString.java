package coadingQuestions;

public class Last4CharOfString {

	public static void main(String[] args) {

		String str="www.teliphone.com";
		
		str=str.toLowerCase();
		
		for(int i=str.length()-4;i<str.length();i++) {
			System.out.print(str.charAt(i));
			
		}
		
		//another method
		String first4=str.substring(0,4);
		System.out.println("first 4 char of given string are -->"+first4);
		
		String last4=str.substring(str.length()-4,str.length());
		System.out.println("Last four char of given string are-->"+last4);
	}

}
