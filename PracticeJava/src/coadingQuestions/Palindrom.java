package coadingQuestions;


class CheckPalindrom{
	public static boolean isPalindrome(String str) {
	
		
		str=str.toLowerCase();
		int start=0;
		int end=str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
public class Palindrom {

	public static void main(String[] args) {
		System.out.println(CheckPalindrom.isPalindrome("srdsfasfsfirs"));
	}

}
