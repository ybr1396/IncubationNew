package today;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n =sc.nextInt();
		int row,col;
		for(row = 1; row<n;row++) {
			for(col=row;col<=n;col++) {
				System.out.print("  ");
			}
			for(col=1;col<row;col++) {
				System.out.print("* ");
			}
			for(col=1;col<=row;col++) {
				System.out.print("* ");
			}
			 System.out.println();
		}
		for(row = 1; row<=n;row++) {
			for(col=1;col<=row;col++) {
				System.out.print("  ");
			}
			for(col=row;col<n;col++) {
				System.out.print("* ");
			}
			for(col=row;col<=n;col++) {
				System.out.print("* ");
			}
			 System.out.println();
		} 
		
	}

}
