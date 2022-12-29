//5.Convert Fahrenheit to Celsius.
package today_Assessment;

import java.util.*;

public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Fahrenheit, Celsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Degree in Fahrenheit: ");
		Fahrenheit = sc.nextFloat();

		Celsius = ((Fahrenheit - 32) * 5) / 9;
		System.out.println(Fahrenheit + " degree Fahrenheit is equal to " + Celsius + "in Celsius");

	}

}
