package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class CursorsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the No of String Elements: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the Values: ");
			
		for(int i = 0; i<n;i++) {
			arr[i] = sc.next();
		}
		ArrayList<String> names = new ArrayList<String>(Arrays.asList(arr));
	    System.out.println(names);
	    Iterator i = names.iterator();
	    
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	}
 }
	       


