package basics;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String palindrome = sc.nextLine();
		int len = palindrome.length();

		char[] tempCharArray = new char[len];
		char[] charArray = new char[len];
		for (int i = 0; i < len; i++) {
			tempCharArray[i] = palindrome.charAt(i);
		}

		for (int j = 0; j < len; j++) {
			charArray[j] = tempCharArray[len - 1 - j];
		}

		String reversePalindrome = new String(charArray);
		System.out.println(reversePalindrome);

//		if (palindrome == reversePalindrome) {
//
//			System.out.println("Given String is Palindrome");
//			if (palindrome != reversePalindrome) {
//				System.out.println("Given String is not Palindrome");
//				}

		}

	}

