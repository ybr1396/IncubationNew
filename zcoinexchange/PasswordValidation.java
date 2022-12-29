package zcoinexchange;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password");
		boolean present = sc.hasNext();

		while (present) {

			String password = sc.nextLine();

			Pattern p = Pattern.compile("[A-Z]?[a-z][*,#,$,@,!]{7}");
			Matcher m = p.matcher(password);
			if (m.find())
				System.out.println(m.group() + "  is valid Password.");
			else
				System.out.println(password + "  is Invalid Password.");
			present = sc.hasNext();
		}
	}
}
