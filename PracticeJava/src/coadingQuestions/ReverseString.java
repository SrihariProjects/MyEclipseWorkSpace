package coadingQuestions;

class StringBuilderclass {
	public static void reverseStri(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse().toString();
		System.out.println(sb);

	}

}

public class ReverseString {

	public static void main(String[] args) {
		StringBuilderclass.reverseStri("srihari");

		// without stringbuilder or stringbuffer

		String str = "Hellow";

		str = str.toLowerCase();

		String revString = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
//			start++;
//			end--;
		}
		System.out.println(revString);
		}

}
