package basics;

import java.util.Scanner;

public class Occurence {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = str.nextLine();
		char[] s1 = s.toCharArray();
		char[] s2 = s.toCharArray();
		int a, count;
		for (int i = 0; i < s1.length; i++) {
			if ((s1[i] >= 65 && s1[i] <= 90) || (s1[i] >= 97 && s1[i] <= 122)) {
				a = s1[i];
				count = 0;
				for (int j = 0; j < s2.length; j++) {
					if ((s2[j] >= 65 && s2[j] <= 90) || (s2[j] >= 97 && s2[j] <= 122)) {
						if (a <= 90) {
							if (s2[j] == a || s2[j] == a + 32) {
								count++;
								s1[j] = '1';
							}
						} else {
							if (s2[j] == a || s2[j] == a - 32) {
								count++;
								s1[j] = '1';
							}
						}
					}
				}
				// if(count==1)
				// System.out.println("Enter the Non Repeated Values: " + s.charAt(i));
				// System.out.print( s.charAt(i));
				System.out.println((char) a + " - " + count);

			}
		}
	}
}
