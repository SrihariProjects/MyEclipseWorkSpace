package coadingQuestions;

public class ReverseStringWords {

	public static void main(String[] args) {

		String input="Srihari is a good boy";
		
		String[] words=input.split("\\s");
		
		for(int i=words.length-1;i>=0;i--) {
//			System.out.print(words[i]+" ");
			
		}
		
		for(String word:words) {
			StringBuilder sb=new StringBuilder(word);
			System.out.print(sb.reverse().toString()+" ");
//			String reverseword=new StringBuilder(word).reverse().toString();
//			System.out.print(reverseword+" ");
		}
	}

}
