package assignments;

import java.util.*;

public class QuadraticEquation {

	private static Scanner sc;
	private static double real_number;
	private static double imaginary_number;

	public static void main(String[] args) {
		double x2 = 0, x1 = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value of b:");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value of c:");
		double c = sc.nextDouble();
		
		double determinant = (b*b)-(4*a*c);
		double sqrt = Math.sqrt(Math.abs(determinant));
		
		if(determinant>0) {
			
			x1 =(-b+sqrt)/(2*a);
			x2 = (-b-sqrt)/(2*a);
		System.out.println("Roots are Real" + x1 + "and Distinct" +x2);	
		} else if (determinant==0) {
			System.out.println("Roots are Same" + (-b+sqrt)/(2*a));
		} else {
			x1= (-b/2*a) + (sqrt/2*a);
			x2= (-b/2*a) - (sqrt/2*a);
			
			System.out.println("Roots are imaginary"+ x1+ "i"+ "and Distinct" + x2+"i" );
		}


	}

	public static double getReal_number() {
		return real_number;
	}

	public static void setReal_number(double real_number) {
		QuadraticEquation.real_number = real_number;
	}

	public static double getImaginary_number() {
		return imaginary_number;
	}

	public static void setImaginary_number(double imaginary_number) {
		QuadraticEquation.imaginary_number = imaginary_number;
	}

}
