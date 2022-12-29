package demo;

import java.util.HashMap;
import java.util.Scanner;

public class GenericsDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String Elements:");
		
		String s = sc.nextLine();
		
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();

		char [] ch = s.toCharArray();
		
		for(char c:ch) {
			
			if(count.containsKey(c))
			{
				count.put(c, count.get(c)+1);
			}
			
			else
			{
				count.put(c, 1);
			}
		}
		System.out.println(count);
	}

}
