package today;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s =sc.nextLine();
        String rev="";
        for(int i=0;i<s.length();i++)
        {
        	char c = s.charAt(i);
        	rev=c+rev;
        }
        	if(s.equalsIgnoreCase(rev)) 
        		System.out.print("Yes it is Palindrome");
        		
        	else
        		System.out.print("NO it is not Palindrome");
        	}
        	
        
      
	}
	

