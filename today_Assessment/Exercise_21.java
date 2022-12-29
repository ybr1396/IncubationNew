//21. Add integer and double value.
package today_Assessment;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		int a = sc.nextInt();

		System.out.println("Enter the value of b:");
		double b = sc.nextDouble();

		sum = a + b;
		System.out.println("Enter the value of sum:" +sum);
	}

}
