//4.Write a Program to print area and perimeter of a circle.
package today_Assessment;

import java.util.*;

public class Exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a Circle: ");
		float radius = sc.nextFloat();

		double area, perimeter;
		area = 3.14 * radius * radius;
		perimeter = 2 * 3.14 * radius;

		System.out.println("Area of Circle: " + area);
		System.out.println("Perimeter of Circle: " + perimeter);
		sc.close();

	}

}
