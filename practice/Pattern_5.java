package practice;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int s = n-1;
		int i,j;
		for(j=1;j<=n;j++) {
			for(i=1;i<=s;i++) {
				System.out.print("  ");
			}
			s--;
			for(i=1;i<2*(j-1);i++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		s=1;
		for(j=1;j<=n-1;j++) {
			for(i=1;i<=s;i++) {
				System.out.print("  ");
			}
			s++;
			for(i=1;i<=2*(n-j)-1;i++) {
				System.out.print("* ");
				}
			
			System.out.println(" ");
		}

	}

}
