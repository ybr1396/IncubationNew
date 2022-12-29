package practice;

import java.util.*;

public class RoughArea_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int row,col;
		for(row=1;row<=n;row++) {

			for(col=row ;col<=n;col++) {
				if(row==1 || col == row|| col == n) {
					System.out.print("*  ");
				}
				else {System.out.print("   ");}

			}System.out.println();

		}
	}}


