//3.Write a java program to compute the Specified expressions.
package today_Assessment;

import java.util.*;

public class Exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c, d, e ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		a = sc.nextFloat();
		System.out.println("Enter the Value of b:");
		b = sc.nextFloat();
		System.out.println("Enter the Value of c:");
		c = sc.nextFloat();
		System.out.println("Enter the Value of d:");
		d = sc.nextFloat();
		e = ((a * b - b * b) / (c - d));

		System.out.print("e=((" + a + "*" + b + "-" + b + "*" + b + ")/(" + c + "-" + d + "))\n" + "Expected output="
				+ ((a * b - b * b) / (c - d)));

		sc.close();
	}

}
