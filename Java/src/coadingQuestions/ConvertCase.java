package coadingQuestions;


public class ConvertCase {

	public static void main(String[] args) {
		
		String str="JavASeleniUm";
		StringBuilder sb=new StringBuilder();
		
		for(char ch:str.toCharArray()) {
			
			if(Character.isLowerCase(ch)) {
				sb.append(Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
			else {
				sb.append(ch);
			}
		}
		System.out.println(str);
		System.out.println(sb.toString());
	}

}
