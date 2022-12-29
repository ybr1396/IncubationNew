package practice;

import java.util.Scanner;

public class Twostring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value of s1:");
		String s1= sc.nextLine();
		System.out.println("Enter the string value of s2:");
		String s2= sc.nextLine();
		
		if(s1.concat(s2) != null) {
			System.out.println("true");
		}
		else
		 {
			System.out.println("false");
		}

	}

}
