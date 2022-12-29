
package today_Assessment;

import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {

		int number, digit = 0,value;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number:");
		number = sc.nextInt();
		while (number > 0) {
			value = number % 10;
			value+=2;
			if(value<10)
				digit = digit * 10 + value;
			else
				digit = digit * 10 + value%10;
			number = number / 10;
		}
		number = digit;
		digit = 0;
		while (number > 0) {
			value = number % 10;
			digit = digit * 10 + value;
			number = number / 10;
		}
		System.out.println("Result:" + digit);
	}

}
