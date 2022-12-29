package basics;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of rows: ");
		row = sc.nextInt();
		// for (i = 1; i <= row - 1; i++)
		for (i = 1; i <= row; i++) {
			for (j = 1; j <= i; j++) {
				count = count + 1;
				if (j == i)
					System.out.print(count);
				else
					System.out.print(count +"*");
			}
			System.out.println(" ");
		}
		for (i =1; i <=row; i++) {
			for (j = row; j>=i; j--) {
				
				if (j == i)
					System.out.print(count);
				else
					System.out.print(count +"*");
				count = count-1;
			}
			
			System.out.println(" ");
		}

//		for (i = row - 1; i >= 0; i--) {
//			for (j = 1; j <= i - 1; j++) {
//				System.out.print(j +" *");
//			}
//			System.out.println(" ");
//		}
	}

}
