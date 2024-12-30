package day2Java;

import java.util.Random;

public class MultiDimentionalArray {

	public static void main(String[] args) {

		//assigning values to a 2d array
		int num[][]= {{1,2,3},{4,5,6}};
		int random;
		random=(int)Math.random()*100;
		
		//printing
//		System.out.println(num[0][1]); //it will print 2
		
		//creating 2d array
		int num2[][]=new int[3][4];
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<4;j++) {
				
				num2[i][j]=(int)(Math.random()*10);
				
				System.out.print(num2[i][j]+" ");
			}
			System.out.println();
		}
		
		//using Enhanced for loop
		
		int i=0;
		for(int n[]:num2) {
			int j=0;
			for(int m:n) {
				num2[i][j]=(int)(Math.random()*10);
				System.out.print(num2[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		//jugged array
		
		int num3[][]=new int[5][];
		
		 num3[0]= new int[1];
		 num3[1]= new int[2];
		 num3[2]= new int[3];
		 num3[3]= new int[4];
		 num3[4]= new int[5];
		 
		 for(int n1[]:num3) {
			 for(int m:n1) {
				 System.out.print(m+" ");
			 }
			 System.out.println();
		 }
		
		 //3d array
		 
		 int num4[][][]=new int[3][4][6];
		 
		 num4[1][1][1]=12345;
		 
		 System.out.println(num4[1][1][1]);
		
		
	}

}
