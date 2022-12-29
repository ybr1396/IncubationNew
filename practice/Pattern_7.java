package practice;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int row,col,p=1;
		for(row=1;row<=n;row++) {
			//if(row%2==0)
			//int p=k;
			for(col=1;col<=row;col++) {
				System.out.print(p++ +"  ");
			}
			//else {System.out.print(p);}
			System.out.println();
		}
		for(row=1;row<=n;row++) {
			//int p=k;
			for(col=row;col<n;col++) {
				System.out.print(p++ +"  ");
			}
			System.out.println();
		}
	}
}
