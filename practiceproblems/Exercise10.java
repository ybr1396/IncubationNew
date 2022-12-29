package practiceproblems;
import java.util.Scanner;
public class Exercise10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Three digit number: ");
		int number = in.nextInt();
		int temp = number;
		int digit1, digit2, digit3;

		digit3 = temp % 10;
		temp = temp / 10;

		digit2 = temp % 10;
		temp = temp / 10;

		digit1 = temp % 10;

		int result = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

		if (number == result) {
			System.out.println("The given number is Armstrong");
		} else {

			System.out.println("The given number is not Armstrong");
		}
		in.close();
	}
}
