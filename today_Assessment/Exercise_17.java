package today_Assessment;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of int:");
		int i = sc.nextInt();
		System.out.println("Enter the value of double:");
		double d = sc.nextDouble();
		System.out.println("Enter the value of char:");
		char c = sc.next().charAt(0);

		System.out.println("Print that Entered value :\n" + i + "," + d + "," + c);
	}

}
