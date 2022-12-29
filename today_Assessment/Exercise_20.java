package today_Assessment;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of chr:");
		char chr= sc.next().charAt(0);
	    System.out.println("Enter the value of a:");
		int a =sc.nextInt();
		
		sum = chr+a;
		System.out.println("Enter the value of sum:\n" + sum);

	}

}
