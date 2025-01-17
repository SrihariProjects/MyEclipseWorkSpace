package coadingQuestions;



class SumOFarrElements {
	public static int sumOFArrayValues(int a[]) {
		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
		
		for(int num:a) {
			sum+=num;
		}
		return sum;
	}
}
public class SumOFArrayNumbers {

	public static void main(String[] args) {
		
		int num=12345;
		int sum=0;
		
		//adding the numbers of a num
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		
		int[] arr= {4,5};
		
		SumOFarrElements obj=new SumOFarrElements();
		System.out.println(obj.sumOFArrayValues(arr));
	}


}
