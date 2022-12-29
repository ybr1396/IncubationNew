package practiceproblems;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int range1, range2;
		System.out.println("Enter a range:");
		range1 = cs.nextInt();
		range2 = cs.nextInt();
		System.out.println("Pronic numbers between " + range1 + " and " + range2 + " are: ");
		for (int i = range1; i <= range2; i++) {
			  //int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (j * (j + 1) == i) {
					//flag = 1;
					System.out.print(i + " ");
					break;
				}
			}

			//if (flag == 1)
				
		}
		cs.close();

	}

}
