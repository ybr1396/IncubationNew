//8.Integer between 0 to 1000 add all digits in integer.
package today_Assessment;

import java.util.Scanner;

public class Exercise_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input an integer between 0 and 1000: ");
		int num = input.nextInt();

		int firstDigit = num % 10;
		int remainingNumber = num / 10;
		int SecondDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int thirdDigit = remainingNumber % 10;
		remainingNumber = remainingNumber / 10;
		int fourthDigit = remainingNumber % 10;
		int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
		System.out.println("The sum of all digits in " + num + " is " + sum);
        input.close();
	}
}


