package basics;
import java.util.Scanner;
public class If_statement {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter Your Age: ");
		Scanner in =new Scanner(System.in);
		age = in.nextInt();
		if (age>=18) {
			
			System.out.println("You are Eligible for Driving license");
		}
		else {
			System.out.println("You are not Eligible for Driving license");
		}
		in.close();
	}

}
