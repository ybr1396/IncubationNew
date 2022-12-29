package practiceproblems;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		int row, i, j, space = 1;
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt(); // 8
		space = row - 1; // 7
		for (j = 1; j <= row; j++) {
			// FOR SPACE PRINT
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--; // 6 5

			// STAR COUNT 1,3,5,7...
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			// NEXTLINE
			System.out.println("");
		}
		// SECOND HALF

		space = 1;
		for (j = 1; j <= row - 1; j++) // ROW
		{
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) // COL
			{
				System.out.print("*");
			}
			// NEXTLINE
			System.out.println("");
		}
		sc.close();
	}

}
