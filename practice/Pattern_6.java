package practice;

import java.util.*;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of elements: ");
			int n =sc.nextInt();
			
		for(int row = 1,p=1; row<n;row++, p++) {
			for(int col=row;col<=n;col++) {
				System.out.print("  ");}
			for(int col=1;col<row;col++) {
				System.out.print(p+" ");}
			for(int col=1;col<=row;col++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		for(int row = 1,p=5;row<=n;row++,p--) {
			for(int col=1;col<=row;col++) {
				System.out.print("  ");}
			for(int col=row;col<n;col++) {
				System.out.print(p+" ");}
			for(int col=row;col<=n;col++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
	}
}






//for(col =row;col<=n;col++) {
//System.out.print(row+" ");}