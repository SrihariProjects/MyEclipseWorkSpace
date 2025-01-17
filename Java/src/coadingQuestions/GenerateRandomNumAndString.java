package coadingQuestions;

import java.util.Random;

public class GenerateRandomNumAndString {

	public static void main(String[] args) {

		Random rand=new Random();
		int random_int=rand.nextInt(2);
		System.out.println(random_int);
		
		//need to download some dependencies
//		RandomStringUtils.randomNumeric(5);
	}

}
