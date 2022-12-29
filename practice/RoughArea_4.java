package practice;

import java.util.Scanner;

public class RoughArea_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int row,col;
		for(row=1;row<=n;row++) {
			for(col=1;col<=row;col++) {
				if(col==1||col==row) {
					System.out.print("* ");}
				else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		for(row=n+1;row<=2*n;row++) {
			for(col=1;col<=2*n-row;col++) {
				if(col==1||row+col == 2*n) {
					System.out.print("* ");}
				else {
					System.out.print("  ");
				}

			}System.out.println();
		}
	}
}
