package assignments2;

import java.util.*;

public class Palindrome {

	public static boolean Palindrome(String a) {
		if(a.length()==0||a.length()==1)
		{
		return true;
		}
		if(a.charAt(0)==a.charAt(a.length()-1)) {
			return Palindrome(a.substring(1, a.length()-1));
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner inp =new Scanner(System.in);
		System.out.print("Enter the String:");
		String string = inp.nextLine();
		if(Palindrome(string)) {
			System.out.println(string + "is a palindrome");
		}
		else {
			System.out.println(string + "is not a palindrome");
		}
		inp.close();
	}
}
