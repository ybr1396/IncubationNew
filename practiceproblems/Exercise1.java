package practiceproblems;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the Number:  ");
				int input = in.nextInt();
				if (input > 0) {
					System.out.println("Entered Number will be POSITIVE");
				} else if (input < 0) {
					System.out.println("Entered Number will be NEGATIVE");
				} else {
					System.out.println("Entered Number is Zero");
				}
				in.close();
				}
	}
