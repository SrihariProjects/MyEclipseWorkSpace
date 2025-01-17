package coadingQuestions;

public class Pattrerns {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
