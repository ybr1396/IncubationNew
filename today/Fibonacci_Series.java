package today;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the Number:");
	    int n = sc.nextInt();
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    int firstTerm = 0, secondTerm = 1;
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	}
	}
}
