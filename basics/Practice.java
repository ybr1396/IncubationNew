package basics;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int value = sc.nextInt();
		int sum = 0;
		sum = value + 1;
		System.out.println("value of sum = " + sum);
		sc.close();
	}
}
