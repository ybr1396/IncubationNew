package practice;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int row,col;
		for(row=1;row<=n;row++) {
			
			for(col=1;col<=n;col++) {
				if(row==n/2+1||col==n/2+1) {
				System.out.print( col+" ");
			}
				else {System.out.print("  ");}
					
				}
			System.out.println();
		}

	}

}
