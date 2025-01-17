package coadingQuestions;

import java.util.Arrays;

class MinMxElementsOne{
	public static void maxmin(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			if(min<=arr[i]) {
				min=arr[i];
			}
			if(max>=arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println("Minimum array is:"+min);
		System.out.println("Maximum array is:"+max);
	}
	
}

class MinMaxElements{
	public static void MinMaxElementsFromArray(int[] arr) {
		
		int min=arr[0],max=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]>=max)
			{
				max=arr[i];
			}
			
			
		}
		System.out.println(max);
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]<=min)
			{
				min=arr[i];
			}
			
			
			
		}
		System.out.println(min);
		
		
	}
}

public class MinMaxElementsFromArray {

	public static void main(String[] args) {

		int[] arr= {1,423,6,46,34,23,13,53,4};
		
		
		MinMxElementsOne method1=new MinMxElementsOne();
		method1.maxmin(arr);
		
		MinMaxElements method2=new MinMaxElements();
		method2.MinMaxElementsFromArray(arr);
		
		
		
		//Method 3
		int min=0, max=arr.length-1;
		
		Arrays.sort(arr);
		
		System.out.println("Minimun element in a given array is:"+arr[min]);
		
		System.out.println("Maximum element in a given array is:"+arr[max]);
		
	}
	
	

}
