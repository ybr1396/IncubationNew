package demo;

import java.util.*;

public class ArrayBasics implements Comparator {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		
		String [] names = new String [n];
		
		
		
		for(int i = 0; i< names.length;i++) {
			names[i] = sc.next();
		}
		System.out.println(Arrays.toString(names));
		
		ArrayBasics ab = new ArrayBasics();
		Arrays.sort(names, ab);
		System.out.println("Using Comparator Interface - Sorting");
			//Arrays.sort(names);
			
			for(int i=0;i<names.length;i++)
				System.out.println(names[i]);	
	}

	@Override
public int compare(Object o1, Object o2) {
		
		String s1 =(String)o1;
		String s2 =(String)o2;
		int result =s1.compareTo(s2);
		if(result>0)
			return -1;
		else if(result<0)
			return 1;
		else
		return 0;
	}

	public void display(String s1,String s2)
	{
		
	}
}






//String name;
//public ArrayBasics(String name) {
// 		
// 		this.name = name;
// 	}


//ArrayBasics a1 = new ArrayBasics("Vikram");
//ArrayBasics a2 = new ArrayBasics("Naveen");
//ArrayBasics a3 = new ArrayBasics("Suriya");
//
//ArrayBasics [] ab = {a1,a2,a3};












//int [] arr1 = new int[n];
//int [] arr2 = new int[n];
//
//for(int i = 0,j=0;i<n||j<n;i++,j++) { 
//arr1[i] = sc.nextInt();
//arr2[j] = sc.nextInt();
//}
//System.out.println(Arrays.toString(arr1));
//System.out.println(Arrays.toString(arr2));
//Arrays.sort(arr2);
//for(int i=0;i<arr2.length;i++) {}
//System.out.println(Arrays.toString(arr2));
//System.out.println(Arrays.equals(arr1, arr2));
