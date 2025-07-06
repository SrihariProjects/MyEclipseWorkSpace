package coadingQuestions;

import java.util.HashSet;

public class OccurrencesInArray {

	public static void main(String[] args) {

		int[] arr=new int[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=4;
		arr[3]=3;
		arr[4]=4;
		
		
		
		//Approch 1
		HashSet<Integer> counted=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!counted.contains(arr[i])) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
				System.out.println("Occurrences of "+arr[i]+ " is -->"+count);
				counted.add(arr[i]);
			}
		}
		
		//Approch 2
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
				int count=1;
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {  
						count++;     
						arr[j]=-1;
					}
				}
				
				System.out.println(arr[i]+"----"+count);
			}
			
		}
		
	}

}
