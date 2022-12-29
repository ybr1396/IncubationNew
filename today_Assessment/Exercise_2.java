//2.Write a java program to print the sum and other operations of two numbers.

package today_Assessment;

import java.util.*;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a = sc.nextInt();
		System.out.println("Enter the value of b:");
		b = sc.nextInt();

		c = a + b;
		System.out.println("Print the value of c:" + c);
		c = a - b;
		System.out.println("Print the value of c:" + c);
		c = a * b;
		System.out.println("Print the value of c:" + c);
		c = a / b;
		System.out.println("Print the value of c:" + c);
		c = a % b;
		System.out.println("Print the value of c:" + c);
		/*System.out.println("Print the value of d:" + d);
		System.out.println("Print the value of e:" + e);
		System.out.println("Print the value of f:" + f);
		System.out.println("Print the value of g:" + g);
		sc.close();*/
	}

}
