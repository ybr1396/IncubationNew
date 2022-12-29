package practice;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no elements: ");
		int n = sc.nextInt();
		int i, j;
		for (i = 0; i < n; i++) {
			for (j =i; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}
