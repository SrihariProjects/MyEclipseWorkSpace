package coadingQuestions;

public class ReverseSentancxeWords {

	public static void main(String[] args) {
		String str = "I am Srihari";
		
		String arr[]=str.split("\\s");
		String result="";
		
		for(int i=arr.length-1;i>=0;i--) {
			result=result+arr[i]+" ";
		}
//		System.out.println(result);
		
		for(String str1:arr)
		{
			String rev="";
			for(int i=str1.length()-1;i>=0;i--) {
				
				rev=rev+str1.charAt(i);
				
			}
			System.out.print(rev+" ");
		}
	}

}
