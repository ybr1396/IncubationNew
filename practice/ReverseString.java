package practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		System.out.println("Enter the reversed string:");
		String sf = sc.nextLine();
		System.out.println("***********************************");
		System.out.println("After reverse the String:\nOutput1:\n");
		System.out.println("***********************************");
		String s1 = "", s2 = "", s3 = "";

		int count = 0, count1 = 0, count2 = 0;

		for (int i = s.length(); i > 0; --i) {
			char c = s.charAt(i - 1);
			if (!Character.isWhitespace(c)) {
				s1 = s1 + c;
				count2++;
			} else {
				System.out.print(c);
			}
			s2 = s.replaceAll("[a,e,i,o,u]", "");

			s3 = s.substring(7, 15).concat(" " + s.substring(0, 6));

			char u = Character.toUpperCase(c);
			if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U')
				count1++;
			System.out.print(c);
			count++;
		}
		/*************************************/

		System.out.println("\nAfter Reverse String:\n");
		String sf1 = "";

		for (int i = sf.length(); i > 0; i--) {
			char c = sf.charAt(i - 1);
			sf1 = sf.substring(9, 15).concat(" " + sf.substring(0, 8));

		}
		System.out.println("***********************************");
		System.out.println("Output3:\n" + sf1);
		System.out.println("***********************************");
		/*************************************/
		System.out.println("\nString Count with space" + "=" + count);
		System.out.println("\nAfter space removal in String:\n" + s1);
		System.out.println("String Count Without Space" + "=" + count2);
		System.out.println("\nString without vowels:\n" + s2);
		System.out.println("\nVowels count" + "=" + count1);
		System.out.println("***********************************");
		System.out.println("\nOutput2:\n" + s3);
		System.out.println("***********************************");
	}
}

//s6="",s7="",s8=""
//System.out.println("Output2:\n"+s8);
//s6=s1.substring(0, 8);
//s7=s1.substring(8, 14);
//s8=s7.concat(" "+s6);
