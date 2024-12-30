package com.Practice;

import java.util.Arrays;

class G{
	public static void missingNum(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
				Arrays.sort(arr);
		while(start<end) {
			int n1=arr[start];
			int n2=arr[start+1];
			if(n2!=(n1+1)) {
				System.out.println(n1+1);
				
			}
			start++;
//			end--;
//			break;
		}
	}
}
public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6,7,9};
		G g=new G();
		g.missingNum(arr);
	}

}
