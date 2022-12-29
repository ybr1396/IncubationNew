package practiceproblems;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input  a: ");
		double a = input.nextDouble();
		System.out.println("Input  b: ");
		double b = input.nextDouble();
		System.out.println("Input  c: ");
		double c = input.nextDouble();
		double result = b * b - 4.0 * a * c;
		if (result > 0.0) {
			double n1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
			double n2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
			System.out.println("The roots are " + n1 +  "  and  "  + n2);
		} else if (result == 0) {
			double n1 = -b / (2.0 * a);
			System.out.println("The root is " + n1);
		} else {
			System.out.println("The equation has no real roots");
		}
		input.close();
	}
}
		


