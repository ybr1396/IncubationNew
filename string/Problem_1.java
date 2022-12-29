package string;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
	    int index1 = str.charAt(0);
	    int index2 = str.charAt(10);
	     System.out.println("The character at position 0 is " +
	            (char)index1);
	     System.out.println("The character at position 10 is " +
	            (char)index2);
	     sc.close();
		

	}

}
